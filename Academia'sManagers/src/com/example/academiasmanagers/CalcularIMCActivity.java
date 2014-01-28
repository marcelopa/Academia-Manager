package com.example.academiasmanagers;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcularIMCActivity extends Activity {

	EditText ePeso;
	EditText eAltura;
	EditText eIMC;

	Button bIMC;

	double altura;
	double peso;
	double imc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calcular_imc);

		ePeso = (EditText) findViewById(R.id.editext_peso);
		eAltura = (EditText) findViewById(R.id.editext_altura);
		eIMC = (EditText) findViewById(R.id.editext_imc);

		bIMC = (Button) findViewById(R.id.botao_calcular);
		bIMC.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				eIMC.setText(String.valueOf(imc(v)));

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calcular_imc, menu);
		return true;
	}

	public double imc(View v) {
		this.altura = Double.parseDouble(eAltura.getText().toString());
		this.peso = Double.parseDouble(ePeso.getText().toString());
		this.imc = this.peso / (this.altura * this.altura);
		return this.imc;

	}

}
