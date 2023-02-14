package com.example.todolist.retrofitApi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\u0003H\'\u00a8\u0006\f"}, d2 = {"Lcom/example/todolist/retrofitApi/RetrofitApi;", "", "addTask", "Lretrofit2/Call;", "Lcom/example/todolist/model/Task;", "taskData", "deleteTask", "", "id", "getAllTasks", "", "Companion", "app_debug"})
public abstract interface RetrofitApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.todolist.retrofitApi.RetrofitApi.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "todos")
    public abstract retrofit2.Call<java.util.List<com.example.todolist.model.Task>> getAllTasks();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "todos")
    public abstract retrofit2.Call<com.example.todolist.model.Task> addTask(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.example.todolist.model.Task taskData);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "todos/{id}")
    public abstract retrofit2.Call<java.lang.String> deleteTask(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/example/todolist/retrofitApi/RetrofitApi$Companion;", "", "()V", "retrofitService", "Lcom/example/todolist/retrofitApi/RetrofitApi;", "getRetrofitService", "()Lcom/example/todolist/retrofitApi/RetrofitApi;", "setRetrofitService", "(Lcom/example/todolist/retrofitApi/RetrofitApi;)V", "getInstance", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.Nullable()
        private static com.example.todolist.retrofitApi.RetrofitApi retrofitService;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.todolist.retrofitApi.RetrofitApi getRetrofitService() {
            return null;
        }
        
        public final void setRetrofitService(@org.jetbrains.annotations.Nullable()
        com.example.todolist.retrofitApi.RetrofitApi p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.todolist.retrofitApi.RetrofitApi getInstance() {
            return null;
        }
    }
}