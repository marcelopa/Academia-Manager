package com.example.academiamanager;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class VisualizarHistoricoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_historico);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.visualizar_historico, menu);
		return true;
	}

}
