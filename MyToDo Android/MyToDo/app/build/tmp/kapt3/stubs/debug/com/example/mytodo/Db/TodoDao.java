package com.example.mytodo.Db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J!\u0010\f\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\r\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/mytodo/Db/TodoDao;", "", "deleteTodo", "", "todo", "Lcom/example/mytodo/models/Todo;", "getAllTodos", "Landroidx/lifecycle/LiveData;", "", "getById", "id", "", "insertTodo", "", "([Lcom/example/mytodo/models/Todo;)V", "updateTodo", "app_debug"})
public abstract interface TodoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM todos")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.mytodo.models.Todo>> getAllTodos();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertTodo(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.models.Todo... todo);
    
    @androidx.room.Update()
    public abstract void updateTodo(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.models.Todo todo);
    
    @androidx.room.Delete()
    public abstract void deleteTodo(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.models.Todo todo);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from todos where todos.id = :id")
    public abstract com.example.mytodo.models.Todo getById(int id);
}