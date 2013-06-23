package com.vn.sqlitedemo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SQLiteDemoActivity extends Activity {

	private TextView textView;
	private Button button;
	private MyDatabase database;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		 textView = (TextView) findViewById(R.id.text_view);
		 button = (Button) findViewById(R.id.button);
		 button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				database = new MyDatabase(getApplication());
				Log.v("TAG", "Successful 1");
				database.openDatabase();
				Log.v("TAG", "Successful 2");
				String str = database.getData();
				Log.v("TAG", "Successful 3");
				textView.setText(str);
				Log.v("TAG", "Successful 4");
				database.closeData();
			}
		});
	}
}
