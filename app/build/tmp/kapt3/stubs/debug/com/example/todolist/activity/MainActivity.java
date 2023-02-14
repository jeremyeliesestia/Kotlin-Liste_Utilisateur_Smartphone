package com.example.todolist.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\"\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\'H\u0016J\u0012\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006+"}, d2 = {"Lcom/example/todolist/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/todolist/adapter/TaskMainAdapter$Listener;", "()V", "TAG", "", "adapter", "Lcom/example/todolist/adapter/TaskMainAdapter;", "binding", "Lcom/example/todolist/databinding/ActivityMainBinding;", "database", "Lcom/example/todolist/database/TaskRoomDatabase;", "factory", "Lcom/example/todolist/viewmodel/TaskViewModelFactory;", "newId", "newTaskActivityRequestCode", "", "retrofitService", "Lcom/example/todolist/retrofitApi/RetrofitApi;", "size", "viewModel", "Lcom/example/todolist/viewmodel/TaskViewModel;", "getViewModel", "()Lcom/example/todolist/viewmodel/TaskViewModel;", "setViewModel", "(Lcom/example/todolist/viewmodel/TaskViewModel;)V", "checkForInternet", "", "context", "Landroid/content/Context;", "majApiRoom", "", "onActivityResult", "requestCode", "resultCode", "intentData", "Landroid/content/Intent;", "onClickDelete", "task", "Lcom/example/todolist/model/Task;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.todolist.adapter.TaskMainAdapter.Listener {
    private int size = 0;
    private java.lang.String newId = "";
    private final java.lang.String TAG = "MainActivity";
    private com.example.todolist.databinding.ActivityMainBinding binding;
    public com.example.todolist.viewmodel.TaskViewModel viewModel;
    private final com.example.todolist.retrofitApi.RetrofitApi retrofitService = null;
    private com.example.todolist.database.TaskRoomDatabase database;
    private com.example.todolist.viewmodel.TaskViewModelFactory factory;
    private com.example.todolist.adapter.TaskMainAdapter adapter;
    private final int newTaskActivityRequestCode = 1;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.todolist.viewmodel.TaskViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.todolist.viewmodel.TaskViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intentData) {
    }
    
    @java.lang.Override()
    public void onClickDelete(@org.jetbrains.annotations.NotNull()
    com.example.todolist.model.Task task) {
    }
    
    private final boolean checkForInternet(android.content.Context context) {
        return false;
    }
    
    public final void majApiRoom() {
    }
}