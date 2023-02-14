package com.example.todolist.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.todolist.repository.TaskRepository
import com.example.todolist.repository.TaskRepositoryRoom

class TaskViewModelFactory(private val taskRepository: TaskRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(TaskViewModel::class.java)) {
            TaskViewModel(this.taskRepository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}