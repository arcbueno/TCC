package com.example.mytodo.Fragments.TodoDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/mytodo/Fragments/TodoDetail/TodoDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repository", "Lcom/example/mytodo/Db/TodoRepository;", "delete", "", "todo", "Lcom/example/mytodo/models/Todo;", "getById", "id", "", "insert", "app_debug"})
public final class TodoDetailViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.mytodo.Db.TodoRepository repository = null;
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.models.Todo todo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mytodo.models.Todo getById(int id) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.models.Todo todo) {
    }
    
    public TodoDetailViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}