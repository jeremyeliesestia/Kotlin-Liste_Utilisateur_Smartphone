package com.example.todolist.retrofitApi

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.todolist.model.Task

@Dao
interface TaskDao {

    @Query("SELECT * FROM task_table")
    fun getTask(): List<Task>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(task: Task)
    @Update
    fun updateTask(task: Task)
    @Delete
    fun deleteTask(task: Task)
}