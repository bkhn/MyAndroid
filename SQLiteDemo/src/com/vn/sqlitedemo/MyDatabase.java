package com.vn.sqlitedemo;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class MyDatabase {
	private static final String TABLE_NAME = "student";
	private Context mContext;
	private SQLiteDatabase mDatabase;
	private OpenHelper mOpenHelper;

	public MyDatabase(Context c) {
		this.mContext = c;
	}

	public MyDatabase openDatabase() throws SQLException {
		mOpenHelper = new OpenHelper(mContext);
		mDatabase = mOpenHelper.getReadableDatabase();
		return this;
	}

	public void closeData() {
		mOpenHelper.close();
	}

	public String getData() {
		String[] columns = new String[] { "name", "school" };
		Cursor c = mDatabase.query(TABLE_NAME, columns, null, null, null, null,
				null);
		String result = "";
//		int id = c.getColumnIndex("id");
		int name = c.getColumnIndex("name");
		int school = c.getColumnIndex("school");

		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			result = result + " " + "name :"
					+ c.getString(name) + " school :" + c.getString(school)
					+ "\n";
		}
		c.close();
		return result;
	}
}
