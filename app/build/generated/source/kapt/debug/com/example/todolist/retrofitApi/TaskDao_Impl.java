package com.example.todolist.retrofitApi;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.todolist.model.Task;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Task> __insertionAdapterOfTask;

  private final EntityDeletionOrUpdateAdapter<Task> __deletionAdapterOfTask;

  private final EntityDeletionOrUpdateAdapter<Task> __updateAdapterOfTask;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTask = new EntityInsertionAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `task_table` (`id`,`_id`,`task`,`description`,`requested_by`,`assignee`,`due_date`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        stmt.bindLong(1, value.getId());
        if (value.get_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.get_id());
        }
        if (value.getTask() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTask());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getRequested_by() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getRequested_by());
        }
        if (value.getAssignee() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getAssignee());
        }
        if (value.getDue_date() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDue_date());
        }
      }
    };
    this.__deletionAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `task_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `task_table` SET `id` = ?,`_id` = ?,`task` = ?,`description` = ?,`requested_by` = ?,`assignee` = ?,`due_date` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        stmt.bindLong(1, value.getId());
        if (value.get_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.get_id());
        }
        if (value.getTask() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTask());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getRequested_by() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getRequested_by());
        }
        if (value.getAssignee() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getAssignee());
        }
        if (value.getDue_date() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDue_date());
        }
        stmt.bindLong(8, value.getId());
      }
    };
  }

  @Override
  public void insert(final Task task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTask.insert(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTask(final Task task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTask.handle(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTask(final Task task) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTask.handle(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Task> getTask() {
    final String _sql = "SELECT * FROM task_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
      final int _cursorIndexOfTask = CursorUtil.getColumnIndexOrThrow(_cursor, "task");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfRequestedBy = CursorUtil.getColumnIndexOrThrow(_cursor, "requested_by");
      final int _cursorIndexOfAssignee = CursorUtil.getColumnIndexOrThrow(_cursor, "assignee");
      final int _cursorIndexOfDueDate = CursorUtil.getColumnIndexOrThrow(_cursor, "due_date");
      final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Task _item;
        _item = new Task();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmp_id;
        _tmp_id = _cursor.getString(_cursorIndexOfId_1);
        _item.set_id(_tmp_id);
        final String _tmpTask;
        _tmpTask = _cursor.getString(_cursorIndexOfTask);
        _item.setTask(_tmpTask);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item.setDescription(_tmpDescription);
        final String _tmpRequested_by;
        _tmpRequested_by = _cursor.getString(_cursorIndexOfRequestedBy);
        _item.setRequested_by(_tmpRequested_by);
        final String _tmpAssignee;
        _tmpAssignee = _cursor.getString(_cursorIndexOfAssignee);
        _item.setAssignee(_tmpAssignee);
        final String _tmpDue_date;
        _tmpDue_date = _cursor.getString(_cursorIndexOfDueDate);
        _item.setDue_date(_tmpDue_date);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
