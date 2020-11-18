package com.example.mytodo.Db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/mytodo/Db/TodoRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allTodos", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/mytodo/models/Todo;", "todoDao", "Lcom/example/mytodo/Db/TodoDao;", "delete", "", "todo", "getAllNotes", "getById", "id", "", "insert", "update", "DeleteTodoAsyncTask", "InsertTodoAsyncTask", "UpdateTodoAsyncTask", "app_debug"})
public final class TodoRepository {
    private com.example.mytodo.Db.TodoDao todoDao;
    private androidx.lifecycle.LiveData<java.util.List<com.example.mytodo.models.Todo>> allTodos;
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.models.Todo todo) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.models.Todo todo) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.models.Todo todo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mytodo.models.Todo>> getAllNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mytodo.models.Todo getById(int id) {
        return null;
    }
    
    public TodoRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\t\u001a\u00020\u00032\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/mytodo/Db/TodoRepository$InsertTodoAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/example/mytodo/models/Todo;", "", "todoDao", "Lcom/example/mytodo/Db/TodoDao;", "(Lcom/example/mytodo/Db/TodoDao;)V", "getTodoDao", "()Lcom/example/mytodo/Db/TodoDao;", "doInBackground", "p0", "", "([Lcom/example/mytodo/models/Todo;)V", "app_debug"})
    static final class InsertTodoAsyncTask extends android.os.AsyncTask<com.example.mytodo.models.Todo, kotlin.Unit, kotlin.Unit> {
        @org.jetbrains.annotations.NotNull()
        private final com.example.mytodo.Db.TodoDao todoDao = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mytodo.Db.TodoDao getTodoDao() {
            return null;
        }
        
        @java.lang.Override()
        protected void doInBackground(@org.jetbrains.annotations.NotNull()
        com.example.mytodo.models.Todo... p0) {
        }
        
        public InsertTodoAsyncTask(@org.jetbrains.annotations.NotNull()
        com.example.mytodo.Db.TodoDao todoDao) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\t\u001a\u00020\u00032\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/mytodo/Db/TodoRepository$UpdateTodoAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/example/mytodo/models/Todo;", "", "todoDao", "Lcom/example/mytodo/Db/TodoDao;", "(Lcom/example/mytodo/Db/TodoDao;)V", "getTodoDao", "()Lcom/example/mytodo/Db/TodoDao;", "doInBackground", "p0", "", "([Lcom/example/mytodo/models/Todo;)V", "app_debug"})
    static final class UpdateTodoAsyncTask extends android.os.AsyncTask<com.example.mytodo.models.Todo, kotlin.Unit, kotlin.Unit> {
        @org.jetbrains.annotations.NotNull()
        private final com.example.mytodo.Db.TodoDao todoDao = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mytodo.Db.TodoDao getTodoDao() {
            return null;
        }
        
        @java.lang.Override()
        protected void doInBackground(@org.jetbrains.annotations.NotNull()
        com.example.mytodo.models.Todo... p0) {
        }
        
        public UpdateTodoAsyncTask(@org.jetbrains.annotations.NotNull()
        com.example.mytodo.Db.TodoDao todoDao) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\t\u001a\u00020\u00032\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/mytodo/Db/TodoRepository$DeleteTodoAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/example/mytodo/models/Todo;", "", "todoDao", "Lcom/example/mytodo/Db/TodoDao;", "(Lcom/example/mytodo/Db/TodoDao;)V", "getTodoDao", "()Lcom/example/mytodo/Db/TodoDao;", "doInBackground", "p0", "", "([Lcom/example/mytodo/models/Todo;)V", "app_debug"})
    static final class DeleteTodoAsyncTask extends android.os.AsyncTask<com.example.mytodo.models.Todo, kotlin.Unit, kotlin.Unit> {
        @org.jetbrains.annotations.NotNull()
        private final com.example.mytodo.Db.TodoDao todoDao = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mytodo.Db.TodoDao getTodoDao() {
            return null;
        }
        
        @java.lang.Override()
        protected void doInBackground(@org.jetbrains.annotations.NotNull()
        com.example.mytodo.models.Todo... p0) {
        }
        
        public DeleteTodoAsyncTask(@org.jetbrains.annotations.NotNull()
        com.example.mytodo.Db.TodoDao todoDao) {
            super();
        }
    }
}