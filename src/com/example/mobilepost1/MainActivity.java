package com.example.mobilepost1;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViews();
		//findviews2();
	}

	private void findViews(){
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
		@Override
			public void onClick(View v) {
				CharSequence text = ((Button)v).getText();
				Toast t1 = Toast.makeText(MainActivity.this, text,Toast.LENGTH_SHORT);
				t1.show();
			}
		});
	}

		public  void findviews2(){
			final EditText etInput = (EditText) findViewById(R.id.etInput);
			etInput.setOnKeyListener(new View.OnKeyListener() {
				
				@Override
				public boolean onKey(View v, int keyCode, KeyEvent event) {
					if(event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER){
						Toast t1 = Toast.makeText(MainActivity.this, etInput.getText(), Toast.LENGTH_LONG);
						t1.show();
						return true;
					}
					return false;
				}
			});
		}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
