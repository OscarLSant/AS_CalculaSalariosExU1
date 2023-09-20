package com.example.u1ex_salarioempleados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void botonSemanal(View view) {
        Button btSemanal = (Button) findViewById(R.id.salarioSemanal);
        Button btMensual = (Button) findViewById(R.id.salarioMensual);
        EditText nombre = findViewById(R.id.nombre);
        EditText apellido = findViewById(R.id.apellido);
        EditText pagoDiario = findViewById(R.id.salarioDiario);
        TextView res = findViewById(R.id.resultado);

        String nom = String.valueOf(nombre.getText().toString());
        String ap = String.valueOf(apellido.getText().toString());
        double pDiario = Double.valueOf(pagoDiario.getText().toString());
        int dias = 7;

        CalculaSalario cs = new CalculaSalario(nom, ap,pDiario, dias);

        res.setText(cs.salarioCalculado().toString());
    }

    public void botonMensual(View view) {
        Button btSemanal = (Button) findViewById(R.id.salarioSemanal);
        Button btMensual = (Button) findViewById(R.id.salarioMensual);
        EditText nombre = findViewById(R.id.nombre);
        EditText apellido = findViewById(R.id.apellido);
        EditText pagoDiario = findViewById(R.id.salarioDiario);

        TextView res = findViewById(R.id.resultado);

        String nom = String.valueOf(nombre.getText().toString());
        String ap = String.valueOf(apellido.getText().toString());
        double pDiario = Double.valueOf(pagoDiario.getText().toString());
        int dias = 30;

        CalculaSalario cs = new CalculaSalario(nom, ap,pDiario, dias);

        res.setText(cs.salarioCalculado().toString());
    }
}