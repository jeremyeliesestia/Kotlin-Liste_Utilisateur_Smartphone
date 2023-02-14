package com.example.todolist.retrofitApi;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/todolist/retrofitApi/TaskDao;", "", "deleteTask", "", "task", "Lcom/example/todolist/model/Task;", "getTask", "", "insert", "updateTask", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM task_table")
    public abstract java.util.List<com.example.todolist.model.Task> getTask();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task);
    
    @androidx.room.Update()
    public abstract void updateTask(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task);
    
    @androidx.room.Delete()
    public abstract void deleteTask(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task);
}