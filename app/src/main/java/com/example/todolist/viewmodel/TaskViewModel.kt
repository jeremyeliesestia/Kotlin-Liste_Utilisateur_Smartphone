package com.example.todolist.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todolist.database.TaskRoomDatabase
import com.example.todolist.model.Task
import com.example.todolist.repository.TaskRepository
import com.example.todolist.repository.TaskRepositoryRoom
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class TaskViewModel(private val taskRepository: TaskRepository) : ViewModel(){


    val taskList = MutableLiveData<List<Task>>()
    val errorMessage = MutableLiveData<String>()


    fun getAllTasks() {
        val response = taskRepository.getAllTasks()
        response.enqueue(object : retrofit2.Callback<List<Task>> {
            override fun onResponse(call: Call<List<Task>>, response: Response<List<Task>>) {
                taskList.postValue(response.body())
            }
            override  fun onFailure(call: Call<List<Task>>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
    fun addTask(task: Task) {
        val data = MutableLiveData<Task>()
        val response = taskRepository.addTask(task)
        response.enqueue(object : retrofit2.Callback<Task> {
            override fun onResponse(call: Call<Task>, response: Response<Task>) {
                data.value = response.body()
            }
            override  fun onFailure(call: Call<Task>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
    fun deleteTask(task: Task) {
        val data = MutableLiveData<Boolean>()
        val response = taskRepository.deleteTask(task._id)
        response.enqueue(object : retrofit2.Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                data.value = response.code() == 200
            }
            override  fun onFailure(call: Call<String>, t: Throwable) {
                data.value = false
            }
        })
    }

    fun getProgramObserver(): MutableLiveData<List<Task>> {
        return taskList
    }
    fun getTask() {
        CoroutineScope(Dispatchers.IO).launch {
            taskList.postValue(taskRepository.getTask())
        }
    }

    fun insert(task: Task) {
        CoroutineScope(Dispatchers.IO).launch {
            taskRepository.insertTask(task)
            getTask()
        }
    }
    fun update(task: Task) {
        CoroutineScope(Dispatchers.IO).launch {
            taskRepository.updateTask(task)
            getTask()
        }
    }

    fun deleteTaskRoom(task: Task) {
        CoroutineScope(Dispatchers.IO).launch {
            taskRepository.deleteTaskRoom(task)
        }
    }
}