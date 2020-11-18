package com.example.mytodo.Fragments.Main;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.mytodo.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListFragmentDirections {
  private ListFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFragmentToFragmentAddTodo() {
    return new ActionOnlyNavDirections(R.id.action_fragment_to_fragment_add_todo);
  }

  @NonNull
  public static ActionFragmentToFragmentTodoDetail actionFragmentToFragmentTodoDetail() {
    return new ActionFragmentToFragmentTodoDetail();
  }

  public static class ActionFragmentToFragmentTodoDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFragmentToFragmentTodoDetail() {
    }

    @NonNull
    public ActionFragmentToFragmentTodoDetail setTodoId(int todoId) {
      this.arguments.put("todoId", todoId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("todoId")) {
        int todoId = (int) arguments.get("todoId");
        __result.putInt("todoId", todoId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_fragment_to_fragment_todo_detail;
    }

    @SuppressWarnings("unchecked")
    public int getTodoId() {
      return (int) arguments.get("todoId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFragmentToFragmentTodoDetail that = (ActionFragmentToFragmentTodoDetail) object;
      if (arguments.containsKey("todoId") != that.arguments.containsKey("todoId")) {
        return false;
      }
      if (getTodoId() != that.getTodoId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getTodoId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFragmentToFragmentTodoDetail(actionId=" + getActionId() + "){"
          + "todoId=" + getTodoId()
          + "}";
    }
  }
}
