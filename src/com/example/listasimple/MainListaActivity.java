package com.example.listasimple;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


public class MainListaActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	public void updateDetail(String nombre) {
		//obtener el fragment detalle
		DetailFragment detail = (DetailFragment)getSupportFragmentManager()
				.findFragmentById(R.id.fragment2);
		detail.update(nombre);
		
	}
    
}
