package com.example.todolist.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task(

    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name ="_id") var _id: String = "",
    @ColumnInfo(name ="task") var task: String? = null,
    @ColumnInfo(name ="description") var description: String? = null,
    @ColumnInfo(name ="requested_by") var requested_by: String? = null,
    @ColumnInfo(name ="assignee") var assignee: String? = null,
    @ColumnInfo(name ="due_date") var due_date: String? = null,
)