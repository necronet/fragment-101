package com.example.listasimple;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_detail, container, false);

		TextView textNombre = (TextView) view.findViewById(R.id.textNombre);
		Bundle args = getArguments(); 

		String nombre = null;
		
		if(args == null )
			nombre = "No se ha seleccionado ningun elemento";
		else
			nombre = args.getString("nombre");
		textNombre.setText(nombre);
		
		return view;

	}

	public static DetailFragment newInstance(Bundle extras) {
		DetailFragment fragment = new DetailFragment();
		
		fragment.setArguments(extras);
		return fragment;
	}

	public void update(String nombre) {
		TextView textNombre = (TextView) getView().findViewById(R.id.textNombre);
		textNombre.setText(nombre);
	}

	
}
