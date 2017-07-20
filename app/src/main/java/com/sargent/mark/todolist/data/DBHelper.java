package com.sargent.mark.todolist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by mark on 7/4/17.
 */

public class DBHelper extends SQLiteOpenHelper{
    //updated database to add done, then updated again to add category
    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "items.db";
    private static final String TAG = "dbhelper";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryString = "CREATE TABLE " + Contract.TABLE_TODO.TABLE_NAME + " ("+
                Contract.TABLE_TODO._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                Contract.TABLE_TODO.COLUMN_NAME_DESCRIPTION + " TEXT NOT NULL, " +
                Contract.TABLE_TODO.COLUMN_NAME_DUE_DATE + " DATE, " +
                //added non-null integer value to the database when created as column name done
                // 0 is false(unchecked,not done)
                // 1 is true(checked, to do is done)
                Contract.TABLE_TODO.COLUMN_NAME_DONE + " INTEGER NOT NULL, " +
                //added non-null integer column to the database when created as column name category
                // 0 is Homework
                // 1 is Chores
                // 2 is Social
                // 3 is Other
                Contract.TABLE_TODO.COLUMN_NAME_CATEGORY + " INTEGER NOT NULL "+ "); ";

        Log.d(TAG, "Create table SQL: " + queryString);
        db.execSQL(queryString);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL("DROP TABLE IF EXISTS " + Contract.TABLE_TODO.TABLE_NAME + "");
        //onCreate(db);
    }
}
