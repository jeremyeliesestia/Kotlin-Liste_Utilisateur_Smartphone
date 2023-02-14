package com.example.todolist.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006J\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/todolist/viewmodel/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lcom/example/todolist/repository/TaskRepository;", "(Lcom/example/todolist/repository/TaskRepository;)V", "errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroidx/lifecycle/MutableLiveData;", "taskList", "", "Lcom/example/todolist/model/Task;", "getTaskList", "addTask", "", "task", "deleteTask", "deleteTaskRoom", "getAllTasks", "getProgramObserver", "getTask", "insert", "update", "app_debug"})
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todolist.repository.TaskRepository taskRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todolist.model.Task>> taskList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessage = null;
    
    public TaskViewModel(@org.jetbrains.annotations.NotNull()
    com.example.todolist.repository.TaskRepository taskRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todolist.model.Task>> getTaskList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void getAllTasks() {
    }
    
    public final void addTask(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
    }
    
    public final void deleteTask(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.todolist.model.Task>> getProgramObserver() {
        return null;
    }
    
    public final void getTask() {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
    }
    
    public final void deleteTaskRoom(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
    }
}