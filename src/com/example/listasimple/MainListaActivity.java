package com.example.listasimple;

import java.util.Arrays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainListaActivity extends FragmentActivity {

	private String [] nombres = {"Fulano mengano", "Juan Perez", "John Doe", "Alistair Mcllister", "David Moreno", "Augusto Bonilla"};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elnombrequequieran);
        
        ListView list = (ListView)findViewById(R.id.mylistview);
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Arrays.asList(nombres));
        list.setAdapter(adapter);
        
       list.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
			//El context source
			//Componente a donde va
			Intent intent  = new Intent(MainListaActivity.this, DetailActivity.class);
			
			//K,V
			intent.putExtra("nombre", nombres[position]);
			
			startActivity(intent);
		}
	});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_lista, menu);
        return true;
    }
    
}
