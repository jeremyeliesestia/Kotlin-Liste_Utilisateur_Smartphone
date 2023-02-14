package com.example.todolist.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0017J\u0016\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/todolist/adapter/TaskMainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/todolist/adapter/TaskViewHolder;", "callback", "Lcom/example/todolist/adapter/TaskMainAdapter$Listener;", "(Lcom/example/todolist/adapter/TaskMainAdapter$Listener;)V", "tasks", "", "Lcom/example/todolist/model/Task;", "getTasks", "()Ljava/util/List;", "setTasks", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTaskList", "task", "", "Listener", "app_debug"})
public final class TaskMainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.todolist.adapter.TaskViewHolder> {
    private final com.example.todolist.adapter.TaskMainAdapter.Listener callback = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.todolist.model.Task> tasks;
    
    public TaskMainAdapter(@org.jetbrains.annotations.NotNull()
    com.example.todolist.adapter.TaskMainAdapter.Listener callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.todolist.model.Task> getTasks() {
        return null;
    }
    
    public final void setTasks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.todolist.model.Task> p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setTaskList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.todolist.model.Task> task) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    @java.lang.Override()
    public com.example.todolist.adapter.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.todolist.adapter.TaskViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/todolist/adapter/TaskMainAdapter$Listener;", "", "onClickDelete", "", "task", "Lcom/example/todolist/model/Task;", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClickDelete(@org.jetbrains.annotations.NotNull()
        com.example.todolist.model.Task task);
    }
}