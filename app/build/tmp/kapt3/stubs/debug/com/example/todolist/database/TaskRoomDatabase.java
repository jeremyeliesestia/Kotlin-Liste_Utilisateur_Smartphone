package com.example.todolist.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.todolist.model.Task.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/todolist/database/TaskRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "taskDao", "Lcom/example/todolist/retrofitApi/TaskDao;", "Companion", "app_debug"})
public abstract class TaskRoomDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.todolist.database.TaskRoomDatabase.Companion Companion = null;
    private static final java.lang.String DB_NAME = "note_database.db";
    @kotlin.jvm.Volatile()
    private static volatile com.example.todolist.database.TaskRoomDatabase instance;
    private static final java.lang.Object LOCK = null;
    
    public TaskRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.todolist.retrofitApi.TaskDao taskDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/todolist/database/TaskRoomDatabase$Companion;", "", "()V", "DB_NAME", "", "LOCK", "instance", "Lcom/example/todolist/database/TaskRoomDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.todolist.database.TaskRoomDatabase invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.example.todolist.database.TaskRoomDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}