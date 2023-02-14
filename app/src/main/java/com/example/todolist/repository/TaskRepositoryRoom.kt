package com.example.todolist.repository

import com.example.todolist.database.TaskRoomDatabase
import com.example.todolist.model.Task
import com.example.todolist.retrofitApi.TaskDao

class TaskRepositoryRoom(private val taskRoomDatabase: TaskRoomDatabase) {
    fun getTask() = taskRoomDatabase.taskDao()?.getTask()
    fun insertTask(task: Task) = taskRoomDatabase.taskDao()?.insert(task)
    fun deleteTaskRoom(task: Task) = taskRoomDatabase.taskDao()?.deleteTask(task)
}