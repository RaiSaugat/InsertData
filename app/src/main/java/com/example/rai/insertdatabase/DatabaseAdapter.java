package com.example.rai.insertdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by sangitashres on 3/5/2017.
 */
public class DatabaseAdapter {
    public SqlLiteHelper helper;
    public SQLiteDatabase db;

    public DatabaseAdapter(Context context) {
        helper = new SqlLiteHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insertData(ContentValues contentValues){
        long id = db.insert(DBConstant.TB_NAME, null, contentValues);
        return id;
    }
}
