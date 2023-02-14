package com.example.todolist.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\tJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/todolist/repository/TaskRepository;", "", "retrofitApi", "Lcom/example/todolist/retrofitApi/RetrofitApi;", "taskRoomDatabase", "Lcom/example/todolist/database/TaskRoomDatabase;", "(Lcom/example/todolist/retrofitApi/RetrofitApi;Lcom/example/todolist/database/TaskRoomDatabase;)V", "addTask", "Lretrofit2/Call;", "Lcom/example/todolist/model/Task;", "task", "deleteTask", "", "id", "deleteTaskRoom", "", "getAllTasks", "", "getTask", "insertTask", "updateTask", "app_debug"})
public final class TaskRepository {
    private final com.example.todolist.retrofitApi.RetrofitApi retrofitApi = null;
    private final com.example.todolist.database.TaskRoomDatabase taskRoomDatabase = null;
    
    public TaskRepository(@org.jetbrains.annotations.NotNull()
    com.example.todolist.retrofitApi.RetrofitApi retrofitApi, @org.jetbrains.annotations.NotNull()
    com.example.todolist.database.TaskRoomDatabase taskRoomDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<com.example.todolist.model.Task>> getAllTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.example.todolist.model.Task> addTask(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.lang.String> deleteTask(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.todolist.model.Task> getTask() {
        return null;
    }
    
    public final void insertTask(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
    }
    
    public final void updateTask(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
    }
    
    public final void deleteTaskRoom(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
    }
}