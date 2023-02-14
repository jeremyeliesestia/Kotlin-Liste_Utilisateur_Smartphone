package com.example.todolist.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.AdapterTaskBinding
import com.example.todolist.model.Task


class TaskMainAdapter(private val callback: Listener): RecyclerView.Adapter<TaskViewHolder>() {
    var tasks = mutableListOf<Task>()

    interface Listener {
        fun onClickDelete(task: Task)
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setTaskList(task: List<Task>) {
        this.tasks = task.toMutableList()
        notifyDataSetChanged()
    }

    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): TaskViewHolder =
        TaskViewHolder(AdapterTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {

        holder.apply {
            bind(tasks[position], callback)
        }

    }

    override fun getItemCount(): Int {
        return tasks.size
    }
}
class TaskViewHolder(val binding: AdapterTaskBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(task: Task, callback: TaskMainAdapter.Listener) {
        binding.task.text= task.task
        binding.taskDeleteButton.setOnClickListener {
            callback.onClickDelete(task)
        }
    }


}