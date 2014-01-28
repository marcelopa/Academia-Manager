package com.example.academiasmanagers;

import java.util.ArrayList;
import java.util.List;
import com.example.academiasmanagers.elementos.*;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AdicionarTreinoActivity extends Activity {

	private Spinner mComboBoxExercicios;
	private ArrayAdapter<Exercicio> mAdapter;
	private List<Exercicio> mExercicios;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adicionar_treino);

		// Spinner Exercícios
		mExercicios = new ArrayList<Exercicio>();

		Exercicio e1 = new Exercicio();
		e1.setId(1);
		e1.setNome("Abdominais rigorosos");
		mExercicios.add(e1);

		Exercicio e2 = new Exercicio();
		e2.setId(2);
		e2.setNome("Boxe");
		mExercicios.add(e2);

		Exercicio e3 = new Exercicio();
		e3.setId(3);
		e3.setNome("Correr em esteira");
		mExercicios.add(e3);

		Exercicio e4 = new Exercicio();
		e4.setId(4);
		e4.setNome("Correr esteira leve");
		mExercicios.add(e4);

		Exercicio e5 = new Exercicio();
		e5.setId(5);
		e5.setNome("Correr sem sair do lugar");
		mExercicios.add(e5);

		Exercicio e6 = new Exercicio();
		e6.setId(6);
		e6.setNome("Corrida vigorosa esteira");
		mExercicios.add(e6);

		Exercicio e7 = new Exercicio();
		e7.setId(7);
		e7.setNome("Flexões");
		mExercicios.add(e7);

		Exercicio e8 = new Exercicio();
		e8.setId(8);
		e8.setNome("Ginástica");
		mExercicios.add(e8);

		Exercicio e9 = new Exercicio();
		e9.setId(9);
		e9.setNome("Jiu-Jitsu");
		mExercicios.add(e9);

		Exercicio e10 = new Exercicio();
		e10.setId(10);
		e10.setNome("Judô");
		mExercicios.add(e10);

		Exercicio e11 = new Exercicio();
		e11.setId(11);
		e11.setNome("Karatê");
		mExercicios.add(e11);

		Exercicio e12 = new Exercicio();
		e12.setId(12);
		e12.setNome("KickBox");
		mExercicios.add(e12);

		Exercicio e13 = new Exercicio();
		e13.setId(13);
		e13.setNome("Musculação aeróbica com descanso");
		mExercicios.add(e13);

		Exercicio e14 = new Exercicio();
		e14.setId(14);
		e14.setNome("Musculação pesos leves");
		mExercicios.add(e14);

		Exercicio e15 = new Exercicio();
		e15.setId(15);
		e15.setNome("Musculação vigorosa com pesos");
		mExercicios.add(e15);

		Exercicio e16 = new Exercicio();
		e16.setId(16);
		e16.setNome("Pedalar bicicleta ergonomética devagar");
		mExercicios.add(e16);

		Exercicio e17 = new Exercicio();
		e17.setId(17);
		e17.setNome("Pedalada bicicleta ergonométrica intenso");
		mExercicios.add(e17);

		Exercicio e18 = new Exercicio();
		e18.setId(18);
		e18.setNome("Pedalar aparelho elíptico");
		mExercicios.add(e18);

		Exercicio e19 = new Exercicio();
		e19.setId(19);
		e19.setNome("Pedalar bicicleta ergonométrica moderado");
		mExercicios.add(e19);

		Exercicio e20 = new Exercicio();
		e20.setId(20);
		e20.setNome("Polichinelos");
		mExercicios.add(e20);

		Exercicio e21 = new Exercicio();
		e21.setId(21);
		e21.setNome("Pular corda moderado");
		mExercicios.add(e21);

		Exercicio e22 = new Exercicio();
		e22.setId(22);
		e22.setNome("Pular corda rápido");
		mExercicios.add(e16);

		Exercicio e23 = new Exercicio();
		e23.setId(23);
		e23.setNome("Socar saco de boxe");
		mExercicios.add(e23);

		Exercicio e24 = new Exercicio();
		e24.setId(24);
		e24.setNome("Subir escada andando");
		mExercicios.add(e24);

		Exercicio e25 = new Exercicio();
		e25.setId(25);
		e25.setNome("Subir escada correndo");
		mExercicios.add(e25);

		Exercicio e26 = new Exercicio();
		e26.setId(26);
		e26.setNome("Taekwondo");
		mExercicios.add(e26);

		mAdapter = new ArrayAdapter<Exercicio>(this,
				R.layout.activity_spinner_exercicios, mExercicios);

		mComboBoxExercicios = (Spinner) findViewById(R.id.spinner_exercicios);

		mComboBoxExercicios.setAdapter(mAdapter);
		// Spinner Exercícios

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.adicionar_treino, menu);
		return true;
	}

}
