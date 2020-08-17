package com.andreskaminker.iuvohelp.room.daos;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.andreskaminker.iuvoshared.entities.ActionKind;
import com.andreskaminker.iuvoshared.entities.Appointment;
import com.andreskaminker.iuvoshared.entities.DateResult;
import com.andreskaminker.iuvoshared.entities.Patient;
import com.andreskaminker.iuvoshared.entities.Status;
import com.andreskaminker.iuvoshared.room.converters.KindConverter;
import com.andreskaminker.iuvoshared.room.converters.StatusConverter;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppointmentDao_Impl implements AppointmentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Appointment> __insertionAdapterOfAppointment;

  private final StatusConverter __statusConverter = new StatusConverter();

  private final KindConverter __kindConverter = new KindConverter();

  private final EntityDeletionOrUpdateAdapter<Appointment> __deletionAdapterOfAppointment;

  public AppointmentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAppointment = new EntityInsertionAdapter<Appointment>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `appointments` (`status`,`kind`,`aptId`,`apppointment_description`,`apppointment_name`,`patId`,`name_given`,`email`,`helper`,`roomInt`,`minutes`,`hour`,`day`,`month`,`year`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Appointment value) {
        final int _tmp;
        _tmp = __statusConverter.fromStatus(value.getStatus());
        stmt.bindLong(1, _tmp);
        final int _tmp_1;
        _tmp_1 = __kindConverter.fromKind(value.getKind());
        stmt.bindLong(2, _tmp_1);
        if (value.getAptId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAptId());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTitle());
        }
        final Patient _tmpPatient = value.getPatient();
        if(_tmpPatient != null) {
          if (_tmpPatient.getPatId() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpPatient.getPatId());
          }
          if (_tmpPatient.getName_given() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpPatient.getName_given());
          }
          if (_tmpPatient.getEmail() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpPatient.getEmail());
          }
          if (_tmpPatient.getHelper() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpPatient.getHelper());
          }
        } else {
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
        }
        final DateResult _tmpScheduledFor = value.getScheduledFor();
        if(_tmpScheduledFor != null) {
          stmt.bindLong(10, _tmpScheduledFor.getRoomInt());
          if (_tmpScheduledFor.getMMinutes() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindLong(11, _tmpScheduledFor.getMMinutes());
          }
          if (_tmpScheduledFor.getMHour() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindLong(12, _tmpScheduledFor.getMHour());
          }
          if (_tmpScheduledFor.getMDay() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindLong(13, _tmpScheduledFor.getMDay());
          }
          if (_tmpScheduledFor.getMMonth() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindLong(14, _tmpScheduledFor.getMMonth());
          }
          if (_tmpScheduledFor.getMYear() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindLong(15, _tmpScheduledFor.getMYear());
          }
        } else {
          stmt.bindNull(10);
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
        }
      }
    };
    this.__deletionAdapterOfAppointment = new EntityDeletionOrUpdateAdapter<Appointment>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `appointments` WHERE `apppointment_name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Appointment value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
      }
    };
  }

  @Override
  public Object addAppointment(final Appointment vararg, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAppointment.insert(vararg);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAppointment(final Appointment vararg, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfAppointment.handle(vararg);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Appointment>> getAllAppointments() {
    final String _sql = "SELECT * FROM appointments";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"appointments"}, false, new Callable<List<Appointment>>() {
      @Override
      public List<Appointment> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfKind = CursorUtil.getColumnIndexOrThrow(_cursor, "kind");
          final int _cursorIndexOfAptId = CursorUtil.getColumnIndexOrThrow(_cursor, "aptId");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "apppointment_description");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apppointment_name");
          final int _cursorIndexOfPatId = CursorUtil.getColumnIndexOrThrow(_cursor, "patId");
          final int _cursorIndexOfNameGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "name_given");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfHelper = CursorUtil.getColumnIndexOrThrow(_cursor, "helper");
          final int _cursorIndexOfRoomInt = CursorUtil.getColumnIndexOrThrow(_cursor, "roomInt");
          final int _cursorIndexOfMMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "minutes");
          final int _cursorIndexOfMHour = CursorUtil.getColumnIndexOrThrow(_cursor, "hour");
          final int _cursorIndexOfMDay = CursorUtil.getColumnIndexOrThrow(_cursor, "day");
          final int _cursorIndexOfMMonth = CursorUtil.getColumnIndexOrThrow(_cursor, "month");
          final int _cursorIndexOfMYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final List<Appointment> _result = new ArrayList<Appointment>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Appointment _item;
            final Patient _tmpPatient;
            if (! (_cursor.isNull(_cursorIndexOfPatId) && _cursor.isNull(_cursorIndexOfNameGiven) && _cursor.isNull(_cursorIndexOfEmail) && _cursor.isNull(_cursorIndexOfHelper))) {
              final String _tmpPatId;
              _tmpPatId = _cursor.getString(_cursorIndexOfPatId);
              final String _tmpName_given;
              _tmpName_given = _cursor.getString(_cursorIndexOfNameGiven);
              final String _tmpEmail;
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
              final String _tmpHelper;
              _tmpHelper = _cursor.getString(_cursorIndexOfHelper);
              _tmpPatient = new Patient(_tmpPatId,_tmpName_given,_tmpEmail,_tmpHelper);
            }  else  {
              _tmpPatient = null;
            }
            final DateResult _tmpScheduledFor;
            if (! (_cursor.isNull(_cursorIndexOfRoomInt) && _cursor.isNull(_cursorIndexOfMMinutes) && _cursor.isNull(_cursorIndexOfMHour) && _cursor.isNull(_cursorIndexOfMDay) && _cursor.isNull(_cursorIndexOfMMonth) && _cursor.isNull(_cursorIndexOfMYear))) {
              _tmpScheduledFor = new DateResult();
              final int _tmpRoomInt;
              _tmpRoomInt = _cursor.getInt(_cursorIndexOfRoomInt);
              _tmpScheduledFor.setRoomInt(_tmpRoomInt);
              final Integer _tmpMMinutes;
              if (_cursor.isNull(_cursorIndexOfMMinutes)) {
                _tmpMMinutes = null;
              } else {
                _tmpMMinutes = _cursor.getInt(_cursorIndexOfMMinutes);
              }
              _tmpScheduledFor.setMMinutes(_tmpMMinutes);
              final Integer _tmpMHour;
              if (_cursor.isNull(_cursorIndexOfMHour)) {
                _tmpMHour = null;
              } else {
                _tmpMHour = _cursor.getInt(_cursorIndexOfMHour);
              }
              _tmpScheduledFor.setMHour(_tmpMHour);
              final Integer _tmpMDay;
              if (_cursor.isNull(_cursorIndexOfMDay)) {
                _tmpMDay = null;
              } else {
                _tmpMDay = _cursor.getInt(_cursorIndexOfMDay);
              }
              _tmpScheduledFor.setMDay(_tmpMDay);
              final Integer _tmpMMonth;
              if (_cursor.isNull(_cursorIndexOfMMonth)) {
                _tmpMMonth = null;
              } else {
                _tmpMMonth = _cursor.getInt(_cursorIndexOfMMonth);
              }
              _tmpScheduledFor.setMMonth(_tmpMMonth);
              final Integer _tmpMYear;
              if (_cursor.isNull(_cursorIndexOfMYear)) {
                _tmpMYear = null;
              } else {
                _tmpMYear = _cursor.getInt(_cursorIndexOfMYear);
              }
              _tmpScheduledFor.setMYear(_tmpMYear);
            }  else  {
              _tmpScheduledFor = null;
            }
            _item = new Appointment();
            final Status _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = __statusConverter.toStatus(_tmp);
            _item.setStatus(_tmpStatus);
            final ActionKind _tmpKind;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfKind);
            _tmpKind = __kindConverter.toHealth(_tmp_1);
            _item.setKind(_tmpKind);
            final String _tmpAptId;
            _tmpAptId = _cursor.getString(_cursorIndexOfAptId);
            _item.setAptId(_tmpAptId);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            _item.setDescription(_tmpDescription);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item.setTitle(_tmpTitle);
            _item.setPatient(_tmpPatient);
            _item.setScheduledFor(_tmpScheduledFor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
