package com.example.parkingapp;

import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME = "DB";
    public static final String TABLE_NAME = "userInfo";
    public static final String COLUMN_EMAIL = "userEmail";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_ID = "ID";

    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    public void onCreate(SQLiteDatabase db)
    {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + COLUMN_EMAIL + " TEXT PRIMARY KEY,"
                + COLUMN_PASSWORD + " TEXT,"
                + COLUMN_ID + " INTEGER" + ")";
        db.execSQL(CREATE_TABLE);
    }

    public boolean addUser(String email, String password, int id)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values  = new ContentValues();
        values.put(COLUMN_EMAIL, email);
        values.put(COLUMN_PASSWORD, password);
        values.put(COLUMN_ID, id);

        long result = db.insert(TABLE_NAME, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("Drop TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

