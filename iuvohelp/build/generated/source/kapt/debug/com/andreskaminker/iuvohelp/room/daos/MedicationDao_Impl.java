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
import com.andreskaminker.iuvoshared.entities.MedicationRequest;
import com.andreskaminker.iuvoshared.entities.Patient;
import com.andreskaminker.iuvoshared.entities.Status;
import com.andreskaminker.iuvoshared.entities.TimeResult;
import com.andreskaminker.iuvoshared.room.converters.KindConverter;
import com.andreskaminker.iuvoshared.room.converters.StatusConverter;
import com.andreskaminker.iuvoshared.room.converters.WeekListConverter;
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
public final class MedicationDao_Impl implements MedicationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MedicationRequest> __insertionAdapterOfMedicationRequest;

  private final StatusConverter __statusConverter = new StatusConverter();

  private final KindConverter __kindConverter = new KindConverter();

  private final WeekListConverter __weekListConverter = new WeekListConverter();

  private final EntityDeletionOrUpdateAdapter<MedicationRequest> __deletionAdapterOfMedicationRequest;

  public MedicationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMedicationRequest = new EntityInsertionAdapter<MedicationRequest>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `medications` (`medId`,`medication_name`,`medication_image`,`status`,`kind`,`week_day`,`patId`,`name_given`,`email`,`helper`,`trId`,`hour`,`minutes`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MedicationRequest value) {
        if (value.getMedId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMedId());
        }
        if (value.getMedication() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMedication());
        }
        if (value.getImageURL() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageURL());
        }
        final int _tmp;
        _tmp = __statusConverter.fromStatus(value.getStatus());
        stmt.bindLong(4, _tmp);
        final int _tmp_1;
        _tmp_1 = __kindConverter.fromKind(value.getKind());
        stmt.bindLong(5, _tmp_1);
        final String _tmp_2;
        _tmp_2 = __weekListConverter.fromArrayList(value.getScheduledFor());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_2);
        }
        final Patient _tmpPatient = value.getPatient();
        if(_tmpPatient != null) {
          if (_tmpPatient.getPatId() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpPatient.getPatId());
          }
          if (_tmpPatient.getName_given() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpPatient.getName_given());
          }
          if (_tmpPatient.getEmail() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpPatient.getEmail());
          }
          if (_tmpPatient.getHelper() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindString(10, _tmpPatient.getHelper());
          }
        } else {
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
        }
        final TimeResult _tmpTakeTime = value.getTakeTime();
        if(_tmpTakeTime != null) {
          stmt.bindLong(11, _tmpTakeTime.getRoomInt());
          stmt.bindLong(12, _tmpTakeTime.getHour());
          stmt.bindLong(13, _tmpTakeTime.getMinutes());
        } else {
          stmt.bindNull(11);
          stmt.bindNull(12);
          stmt.bindNull(13);
        }
      }
    };
    this.__deletionAdapterOfMedicationRequest = new EntityDeletionOrUpdateAdapter<MedicationRequest>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `medications` WHERE `medication_name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MedicationRequest value) {
        if (value.getMedication() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getMedication());
        }
      }
    };
  }

  @Override
  public Object addMedication(final MedicationRequest vararg, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMedicationRequest.insert(vararg);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteMedication(final MedicationRequest vararg,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMedicationRequest.handle(vararg);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<MedicationRequest>> getAllMedications() {
    final String _sql = "SELECT * FROM medications";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"medications"}, false, new Callable<List<MedicationRequest>>() {
      @Override
      public List<MedicationRequest> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMedId = CursorUtil.getColumnIndexOrThrow(_cursor, "medId");
          final int _cursorIndexOfMedication = CursorUtil.getColumnIndexOrThrow(_cursor, "medication_name");
          final int _cursorIndexOfImageURL = CursorUtil.getColumnIndexOrThrow(_cursor, "medication_image");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfKind = CursorUtil.getColumnIndexOrThrow(_cursor, "kind");
          final int _cursorIndexOfScheduledFor = CursorUtil.getColumnIndexOrThrow(_cursor, "week_day");
          final int _cursorIndexOfPatId = CursorUtil.getColumnIndexOrThrow(_cursor, "patId");
          final int _cursorIndexOfNameGiven = CursorUtil.getColumnIndexOrThrow(_cursor, "name_given");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfHelper = CursorUtil.getColumnIndexOrThrow(_cursor, "helper");
          final int _cursorIndexOfRoomInt = CursorUtil.getColumnIndexOrThrow(_cursor, "trId");
          final int _cursorIndexOfHour = CursorUtil.getColumnIndexOrThrow(_cursor, "hour");
          final int _cursorIndexOfMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "minutes");
          final List<MedicationRequest> _result = new ArrayList<MedicationRequest>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MedicationRequest _item;
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
            final TimeResult _tmpTakeTime;
            if (! (_cursor.isNull(_cursorIndexOfRoomInt) && _cursor.isNull(_cursorIndexOfHour) && _cursor.isNull(_cursorIndexOfMinutes))) {
              _tmpTakeTime = new TimeResult();
              final int _tmpRoomInt;
              _tmpRoomInt = _cursor.getInt(_cursorIndexOfRoomInt);
              _tmpTakeTime.setRoomInt(_tmpRoomInt);
              final int _tmpHour;
              _tmpHour = _cursor.getInt(_cursorIndexOfHour);
              _tmpTakeTime.setHour(_tmpHour);
              final int _tmpMinutes;
              _tmpMinutes = _cursor.getInt(_cursorIndexOfMinutes);
              _tmpTakeTime.setMinutes(_tmpMinutes);
            }  else  {
              _tmpTakeTime = null;
            }
            _item = new MedicationRequest();
            final String _tmpMedId;
            _tmpMedId = _cursor.getString(_cursorIndexOfMedId);
            _item.setMedId(_tmpMedId);
            final String _tmpMedication;
            _tmpMedication = _cursor.getString(_cursorIndexOfMedication);
            _item.setMedication(_tmpMedication);
            final String _tmpImageURL;
            _tmpImageURL = _cursor.getString(_cursorIndexOfImageURL);
            _item.setImageURL(_tmpImageURL);
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
            final ArrayList<Integer> _tmpScheduledFor;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfScheduledFor);
            _tmpScheduledFor = __weekListConverter.toArrayList(_tmp_2);
            _item.setScheduledFor(_tmpScheduledFor);
            _item.setPatient(_tmpPatient);
            _item.setTakeTime(_tmpTakeTime);
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
