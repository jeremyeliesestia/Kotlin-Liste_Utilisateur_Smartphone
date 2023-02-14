package com.example.todolist.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todolist.model.Task
import com.example.todolist.retrofitApi.TaskDao

@Database(
    entities = [Task::class],
    version = 1,
    exportSchema = false
)

abstract class TaskRoomDatabase: RoomDatabase() {
    abstract fun taskDao(): TaskDao

    companion object {
        private const val DB_NAME = "note_database.db"
        @Volatile private var instance: TaskRoomDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            TaskRoomDatabase::class.java,
            DB_NAME
        ).build()
    }
}