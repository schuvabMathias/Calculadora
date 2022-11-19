package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_numerador, et_denominador;
    private TextView resultado;

    @SuppressLint("MissingInflatedId") //COMENTAR AL PROFE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_numerador = (EditText) findViewById(R.id.in_numerador);
        et_denominador = (EditText) findViewById(R.id.in_denominador);
        resultado = (TextView) findViewById(R.id.out_resultado);
    }

    public void multiplicar(View view) {
        String numerado = et_numerador.getText().toString();
        String denominado = et_denominador.getText().toString();
        if(!numerado.isEmpty() && !denominado.isEmpty()){
        Double numerador = Double.parseDouble(numerado);
        Double denominador = Double.parseDouble(denominado);
        Double multiplicacion;
            multiplicacion = numerador * denominador;
            resultado.setText(multiplicacion.toString());
        }else{
            resultado.setText("Ingrese los valores en los campos");
        }
    }

    public void sumar(View view) {
        String numerado = et_numerador.getText().toString();
        String denominado = et_denominador.getText().toString();
        if(!numerado.isEmpty() && !denominado.isEmpty()){
            Double numerador = Double.parseDouble(numerado);
            Double denominador = Double.parseDouble(denominado);
            Double suma;
            suma = numerador + denominador;
            resultado.setText(suma.toString());
        }else{
            resultado.setText("Por favor, ingrese valores correctos en los campos");
        }
    }

    public void restar(View view) {
        String numerado = et_numerador.getText().toString();
        String denominado = et_denominador.getText().toString();
        if(!numerado.isEmpty() && !denominado.isEmpty()){
            Double numerador = Double.parseDouble(numerado);
            Double denominador = Double.parseDouble(denominado);
            Double resta;
            resta = numerador - denominador;
            resultado.setText(resta.toString());
        }else{
            resultado.setText("Por favor, ingrese valores correctos en los campos");
        }
    }

    public void dividir(View view) {
        String numerado = et_numerador.getText().toString();
        String denominado = et_denominador.getText().toString();
        if(!numerado.isEmpty() && !denominado.isEmpty()){
            Double numerador = Double.parseDouble(numerado);
            Double denominador = Double.parseDouble(denominado);
            Double division;
            if (denominador == 0){
                resultado.setText("No se puede dividir por cero!"); //aca hacer un toast
            }else{
                division = numerador / denominador;
                resultado.setText(division.toString());
            }

        }else{
            resultado.setText("Por favor, ingrese valores correctos en los campos");
        }
    }

    public void modulo(View view) {
        String numerado = et_numerador.getText().toString();
        String denominado = et_denominador.getText().toString();
        if(!numerado.isEmpty() && !denominado.isEmpty()){
            Double numerador = Double.parseDouble(numerado);
            Double denominador = Double.parseDouble(denominado);
            Double modular;
            modular = numerador % denominador;
            resultado.setText(modular.toString());
        }else{
            resultado.setText("Por favor, ingrese valores correctos en los campos");
        }
    }


    public void salir (View view){
        /*El cierre de la conexión va si se abre la BD de manera global en onCreate()*/
        super.onDestroy();
        finish();
        System.exit(0);
    }
}