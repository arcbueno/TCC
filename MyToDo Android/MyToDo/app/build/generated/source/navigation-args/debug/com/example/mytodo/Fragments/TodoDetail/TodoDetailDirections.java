package com.example.mytodo.Fragments.TodoDetail;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mytodo.R;

public class TodoDetailDirections {
  private TodoDetailDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentTodoDetailToFragment() {
    return new ActionOnlyNavDirections(R.id.action_fragment_todo_detail_to_fragment);
  }
}
