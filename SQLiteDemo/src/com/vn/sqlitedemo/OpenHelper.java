package com.vn.sqlitedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class OpenHelper extends SQLiteOpenHelper {
	public static final String DATABASE_NAME = "STUDENT.sqlite";
	public static final int DATABASE_VERSION = 1;

	public static final String TABLE_NAME = "student";
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String SCHOOL = "school";

	

	// Constructor to open database
	public OpenHelper(Context context) {
		// TODO Auto-generated constructor stub
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
//		db.execSQL("CREATE TABLE" + TABLE_NAME + "(" + ID
//				+ "integer primary key autoincrement not null" + NAME + "text"
//				+ SCHOOL + "text)");
//		db.execSQL("CREATE TABLE"+ TABLE_NAME +"("+NAME +"TEXT"+SCHOOL +"TEXT"+")");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
	}
}
