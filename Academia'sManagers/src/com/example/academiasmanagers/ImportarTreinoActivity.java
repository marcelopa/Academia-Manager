package com.example.academiasmanagers;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ImportarTreinoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_importar_treino);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.importar_treino, menu);
		return true;
	}

}
