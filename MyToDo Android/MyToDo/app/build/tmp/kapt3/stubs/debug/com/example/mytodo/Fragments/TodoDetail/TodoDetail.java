package com.example.mytodo.Fragments.TodoDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\f\u0010/\u001a\u00020 *\u00020&H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00061"}, d2 = {"Lcom/example/mytodo/Fragments/TodoDetail/TodoDetail;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/mytodo/databinding/FragmentTodoDetailBinding;", "getBinding", "()Lcom/example/mytodo/databinding/FragmentTodoDetailBinding;", "setBinding", "(Lcom/example/mytodo/databinding/FragmentTodoDetailBinding;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "todoData", "Lcom/example/mytodo/models/Todo;", "getTodoData", "()Lcom/example/mytodo/models/Todo;", "setTodoData", "(Lcom/example/mytodo/models/Todo;)V", "todoViewModel", "Lcom/example/mytodo/Fragments/TodoDetail/TodoDetailViewModel;", "getTodoViewModel", "()Lcom/example/mytodo/Fragments/TodoDetail/TodoDetailViewModel;", "setTodoViewModel", "(Lcom/example/mytodo/Fragments/TodoDetail/TodoDetailViewModel;)V", "addTodo", "", "todo", "deleteTodo", "", "getTodo", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "hideKeyboard", "Companion", "app_debug"})
public final class TodoDetail extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.example.mytodo.databinding.FragmentTodoDetailBinding binding;
    @org.jetbrains.annotations.NotNull()
    public com.example.mytodo.Fragments.TodoDetail.TodoDetailViewModel todoViewModel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    private com.example.mytodo.models.Todo todoData;
    public static final com.example.mytodo.Fragments.TodoDetail.TodoDetail.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mytodo.databinding.FragmentTodoDetailBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.databinding.FragmentTodoDetailBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mytodo.Fragments.TodoDetail.TodoDetailViewModel getTodoViewModel() {
        return null;
    }
    
    public final void setTodoViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.Fragments.TodoDetail.TodoDetailViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.mytodo.models.Todo getTodoData() {
        return null;
    }
    
    public final void setTodoData(@org.jetbrains.annotations.Nullable()
    com.example.mytodo.models.Todo p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean addTodo(com.example.mytodo.models.Todo todo) {
        return false;
    }
    
    private final void deleteTodo(int id) {
    }
    
    private final com.example.mytodo.models.Todo getTodo(int id) {
        return null;
    }
    
    private final void hideKeyboard(android.view.View $this$hideKeyboard) {
    }
    
    public TodoDetail() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mytodo.Fragments.TodoDetail.TodoDetail newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mytodo/Fragments/TodoDetail/TodoDetail$Companion;", "", "()V", "newInstance", "Lcom/example/mytodo/Fragments/TodoDetail/TodoDetail;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mytodo.Fragments.TodoDetail.TodoDetail newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}