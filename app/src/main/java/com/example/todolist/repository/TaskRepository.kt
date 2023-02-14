package com.example.todolist.repository

import com.example.todolist.database.TaskRoomDatabase
import com.example.todolist.model.Task
import com.example.todolist.retrofitApi.RetrofitApi

class TaskRepository(private val retrofitApi: RetrofitApi,private val taskRoomDatabase: TaskRoomDatabase) {
    fun getAllTasks() = retrofitApi.getAllTasks()
    fun addTask(task: Task) = retrofitApi.addTask(task)
    fun deleteTask(id: String) = retrofitApi.deleteTask(id)

    fun getTask() = taskRoomDatabase.taskDao()?.getTask()
    fun insertTask(task: Task) = taskRoomDatabase.taskDao()?.insert(task)
    fun updateTask(task: Task) = taskRoomDatabase.taskDao()?.updateTask(task)
    fun deleteTaskRoom(task: Task) = taskRoomDatabase.taskDao()?.deleteTask(task)
}