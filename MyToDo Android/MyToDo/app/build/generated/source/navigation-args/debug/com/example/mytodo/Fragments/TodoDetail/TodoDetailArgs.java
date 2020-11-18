package com.example.mytodo.Fragments.TodoDetail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TodoDetailArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TodoDetailArgs() {
  }

  private TodoDetailArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TodoDetailArgs fromBundle(@NonNull Bundle bundle) {
    TodoDetailArgs __result = new TodoDetailArgs();
    bundle.setClassLoader(TodoDetailArgs.class.getClassLoader());
    if (bundle.containsKey("todoId")) {
      int todoId;
      todoId = bundle.getInt("todoId");
      __result.arguments.put("todoId", todoId);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getTodoId() {
    return (int) arguments.get("todoId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("todoId")) {
      int todoId = (int) arguments.get("todoId");
      __result.putInt("todoId", todoId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    TodoDetailArgs that = (TodoDetailArgs) object;
    if (arguments.containsKey("todoId") != that.arguments.containsKey("todoId")) {
      return false;
    }
    if (getTodoId() != that.getTodoId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getTodoId();
    return result;
  }

  @Override
  public String toString() {
    return "TodoDetailArgs{"
        + "todoId=" + getTodoId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(TodoDetailArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public TodoDetailArgs build() {
      TodoDetailArgs result = new TodoDetailArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTodoId(int todoId) {
      this.arguments.put("todoId", todoId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getTodoId() {
      return (int) arguments.get("todoId");
    }
  }
}
