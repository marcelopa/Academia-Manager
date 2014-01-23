package com.example.academiamanager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnItemClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button bAdicionarTreino;
		Button bRotinaDeTreino;
		Button bVisualizarHistorico;
		Button bAjuda;

		bAdicionarTreino = (Button) findViewById(R.id.adicionar_treino);
		bAdicionarTreino.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				adicionarTreinos(v);

			}
		});

		bRotinaDeTreino = (Button) findViewById(R.id.copiar_rotina);
		bRotinaDeTreino.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				copiarRotinaDeTreinos(v);

			}
		});

		bVisualizarHistorico = (Button) findViewById(R.id.visualizar_historico);
		bVisualizarHistorico.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				visualizarHistorico(v);

			}
		});

		bAjuda = (Button) findViewById(R.id.ajuda);
		bAjuda.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ajuda(v);

			}
		});

	}

	public void adicionarTreinos(View v) {
		Intent intent = new Intent(this, AdicionarTreinoActivity.class);
		startActivity(intent);
	}

	public void copiarRotinaDeTreinos(View v) {
		Intent intent = new Intent(this, CopiarRotinaDeTreinosActivity.class);
		startActivity(intent);
	}

	public void visualizarHistorico(View v) {
		Intent intent = new Intent(this, VisualizarHistoricoActivity.class);
		startActivity(intent);
	}

	public void ajuda(View v) {
		Intent intent = new Intent(this, AjudaActivity.class);
		startActivity(intent);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub

	}
}