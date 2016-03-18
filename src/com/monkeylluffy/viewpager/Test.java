package com.monkeylluffy.viewpager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Test extends Activity implements OnClickListener {
	Button btn1, btn2, btn3, btn4;
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);

		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		btn3 = (Button) findViewById(R.id.button3);
		btn4 = (Button) findViewById(R.id.button4);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			intent = new Intent(this,MainActivity.class);
			startActivity(intent);
			break;
		case R.id.button2:

			intent = new Intent(this,TwoActivity.class);
			startActivity(intent);
			break;
		case R.id.button3:

			intent = new Intent(this,ThreeActivity.class);
			startActivity(intent);
			break;
		case R.id.button4:

			intent = new Intent(this,FourActvitiy.class);
			startActivity(intent);
			break;

		}
	}

}
