package com.example.mytodo.Fragments.AddTodo;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mytodo.R;

public class AddTodoFragmentDirections {
  private AddTodoFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentAddTodoToFragment() {
    return new ActionOnlyNavDirections(R.id.action_fragment_add_todo_to_fragment);
  }
}
