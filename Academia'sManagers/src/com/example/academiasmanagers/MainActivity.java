package com.example.academiasmanagers;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button bAdicionarTreino;
	Button bCalcularIMC;
	Button bImportarTreino;
	Button bVisualizarHistorico;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bAdicionarTreino = (Button) findViewById(R.id.botao_adicionar_treino);
		bAdicionarTreino.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mudarTelaAdicionarTreino(v);

			}
		});

		bCalcularIMC = (Button) findViewById(R.id.botao_calcular_imc);
		bCalcularIMC.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mudarTelaCalcularIMC(v);

			}
		});

		bImportarTreino = (Button) findViewById(R.id.botao_importar_treino);
		bImportarTreino.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mudarTelaImportarTreino(v);

			}
		});

		bVisualizarHistorico = (Button) findViewById(R.id.botao_visualizar_historico);
		bVisualizarHistorico.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mudarTelaVisualizarHistorico(v);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void mudarTelaAdicionarTreino(View v) {
		Intent intent = new Intent(this, AdicionarTreinoActivity.class);
		startActivity(intent);
	}

	public void mudarTelaCalcularIMC(View v) {
		Intent intent = new Intent(this, CalcularIMCActivity.class);
		startActivity(intent);
	}

	public void mudarTelaImportarTreino(View v) {
		Intent intent = new Intent(this, ImportarTreinoActivity.class);
		startActivity(intent);
	}

	public void mudarTelaVisualizarHistorico(View v) {
		Intent intent = new Intent(this, VisualizarHistoricoActivity.class);
		startActivity(intent);
	}

}
