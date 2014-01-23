package com.example.academiamanager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CopiarRotinaDeTreinosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_copiar_rotina_de_treinos);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.copiar_rotina_de_treinos, menu);
		return true;
	}

}
