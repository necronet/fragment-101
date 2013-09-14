package com.example.listasimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		
		TextView textNombre = (TextView)findViewById(R.id.textNombre);
		
		Intent intent = getIntent();
		
		String nombre = intent.getStringExtra("nombre");
		
		textNombre.setText(nombre);
		
	}

	
}
