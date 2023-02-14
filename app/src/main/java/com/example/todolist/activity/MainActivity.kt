package com.example.todolist.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.todolist.R
import com.example.todolist.adapter.TaskMainAdapter
import com.example.todolist.database.TaskRoomDatabase
import com.example.todolist.databinding.ActivityMainBinding
import com.example.todolist.model.Task
import com.example.todolist.repository.TaskRepository
import com.example.todolist.repository.TaskRepositoryRoom
import com.example.todolist.retrofitApi.RetrofitApi
import com.example.todolist.viewmodel.TaskViewModel
import com.example.todolist.viewmodel.TaskViewModelFactory

class MainActivity : AppCompatActivity(), TaskMainAdapter.Listener {
    private var size = 0
    private var newId = ""
    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: TaskViewModel
    private val retrofitService = RetrofitApi.getInstance()
    private lateinit var database: TaskRoomDatabase
    private lateinit var factory: TaskViewModelFactory
    private lateinit var adapter: TaskMainAdapter
    private val newTaskActivityRequestCode = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = TaskMainAdapter(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        database = TaskRoomDatabase(this)
        factory = TaskViewModelFactory(TaskRepository(retrofitService, database))
        viewModel = ViewModelProvider(this, factory)[(TaskViewModel::class.java)]
        binding.recyclerview.adapter = adapter
        majApiRoom()
        viewModel.taskList.observe(this, Observer {
            adapter.setTaskList(it)
        })

        viewModel.errorMessage.observe(this, Observer {
        })


        if (checkForInternet(this)) {
            viewModel.getAllTasks()
        } else {
            viewModel.getTask()
        }
        //viewModel.getTask()


        binding.activityFab.setOnClickListener {
            val intent = Intent(this@MainActivity, NewTaskActivity::class.java)
            startActivityForResult(intent, newTaskActivityRequestCode)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?) {
        super.onActivityResult(requestCode, resultCode, intentData)
        if (requestCode == newTaskActivityRequestCode && resultCode == Activity.RESULT_OK) {
            val task = Task()
            task._id = ""
            task.task  = intentData?.getStringExtra("EXTRA_TASK")
            task.description = intentData?.getStringExtra("EXTRA_DESCRIPTION")
            task.assignee = intentData?.getStringExtra("EXTRA_ASSIGNEE")
            task.requested_by = intentData?.getStringExtra("EXTRA_REQUESTED")
            task.due_date = intentData?.getStringExtra("EXTRA_DATE")



            if (checkForInternet(this)) {
                viewModel.addTask(task)
                viewModel.taskList.observe(this, {
                    size = it.size
                })
                viewModel.taskList.observe(this, {
                    newId = it[size-1]._id
                    task._id =  newId
                    Log.d("value", task.task.toString())
                })
                viewModel.insert(task)
                viewModel.getAllTasks()
            } else {
                viewModel.insert(task)
                viewModel.getTask()
            }
        } else {
            Toast.makeText(
                applicationContext,
                R.string.empty_not_saved,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun onClickDelete(task: Task) {
        viewModel = ViewModelProvider(this, factory)[(TaskViewModel::class.java)]
        if (checkForInternet(this)) {
            viewModel.deleteTask(task)
            viewModel.deleteTaskRoom(task)
            viewModel.getAllTasks()
        }else {
            viewModel.deleteTaskRoom(task)
            viewModel.getTask()
        }
    }


    private fun checkForInternet(context: Context): Boolean {

        // register activity with the connectivity manager service
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        // if the android version is equal to M
        // or greater we need to use the
        // NetworkCapabilities to check what type of
        // network has the internet connection
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            // Returns a Network object corresponding to
            // the currently active default data network.
            val network = connectivityManager.activeNetwork ?: return false

            // Representation of the capabilities of an active network.
            val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false

            return when {
                // Indicates this network uses a Wi-Fi transport,
                // or WiFi has network connectivity
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true

                // Indicates this network uses a Cellular transport. or
                // Cellular has network connectivity
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true

                // else return false
                else -> false
            }
        } else {
            // if the android version is below M
            @Suppress("DEPRECATION") val networkInfo =
                connectivityManager.activeNetworkInfo ?: return false
            @Suppress("DEPRECATION")
            return networkInfo.isConnected
        }
    }
    fun majApiRoom () {
        if (checkForInternet(this)) {
            viewModel.getAllTasks()
            viewModel.getTask()
            viewModel.taskList.observe(this, {
                for(task in it) {
                    Log.d("value", task.description.toString())

                }
            })


            //viewModel.taskList.observe(this, {
                    //if(it._id == "") {
                        //viewModel.addTask(task)
                        //viewModel.taskList.observe(this, {
                            //newId = it[size]._id
                            //task._id =  newId
                            //viewModel.update(task)
                        //})
                    ///}
               // }
            //})
        }
    }
}