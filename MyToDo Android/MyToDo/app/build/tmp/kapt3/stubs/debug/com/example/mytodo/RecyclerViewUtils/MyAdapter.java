package com.example.mytodo.RecyclerViewUtils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u0014\u0010\u001e\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/example/mytodo/RecyclerViewUtils/MyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mytodo/RecyclerViewUtils/MyViewHolder;", "viewModel", "Lcom/example/mytodo/Fragments/Main/ListFragmentViewModel;", "lista", "Lcom/example/mytodo/models/IListaTodo;", "(Lcom/example/mytodo/Fragments/Main/ListFragmentViewModel;Lcom/example/mytodo/models/IListaTodo;)V", "getLista", "()Lcom/example/mytodo/models/IListaTodo;", "todos", "", "Lcom/example/mytodo/models/Todo;", "getViewModel", "()Lcom/example/mytodo/Fragments/Main/ListFragmentViewModel;", "setViewModel", "(Lcom/example/mytodo/Fragments/Main/ListFragmentViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTodo", "app_debug"})
public final class MyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mytodo.RecyclerViewUtils.MyViewHolder> {
    private java.util.List<com.example.mytodo.models.Todo> todos;
    @org.jetbrains.annotations.NotNull()
    private com.example.mytodo.Fragments.Main.ListFragmentViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mytodo.models.IListaTodo lista = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.RecyclerViewUtils.MyViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mytodo.RecyclerViewUtils.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setTodo(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.mytodo.models.Todo> todos) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.RecyclerViewUtils.MyViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mytodo.Fragments.Main.ListFragmentViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.Fragments.Main.ListFragmentViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mytodo.models.IListaTodo getLista() {
        return null;
    }
    
    public MyAdapter(@org.jetbrains.annotations.NotNull()
    com.example.mytodo.Fragments.Main.ListFragmentViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.example.mytodo.models.IListaTodo lista) {
        super();
    }
}