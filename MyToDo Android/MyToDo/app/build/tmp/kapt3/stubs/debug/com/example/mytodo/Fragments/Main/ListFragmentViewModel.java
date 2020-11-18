package com.example.mytodo.Fragments.Main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/mytodo/Fragments/Main/ListFragmentViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allTodos", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/mytodo/models/Todo;", "listaTodo", "Lcom/example/mytodo/Fragments/Main/ListaTodo;", "getListaTodo", "()Lcom/example/mytodo/Fragments/Main/ListaTodo;", "repository", "Lcom/example/mytodo/Db/TodoRepository;", "getAllTodos", "app_debug"})
public final class ListFragmentViewModel extends androidx.lifecycle.AndroidViewModel {
    private com.example.mytodo.Db.TodoRepository repository;
    private androidx.lifecycle.LiveData<java.util.List<com.example.mytodo.models.Todo>> allTodos;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mytodo.Fragments.Main.ListaTodo listaTodo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mytodo.Fragments.Main.ListaTodo getListaTodo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mytodo.models.Todo>> getAllTodos() {
        return null;
    }
    
    public ListFragmentViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}