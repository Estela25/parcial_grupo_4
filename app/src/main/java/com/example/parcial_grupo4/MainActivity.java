package com.example.parcial_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void acelerometro(View view){
        Intent aceler = new Intent(this,Acelerometro.class);
        startActivity(aceler);
    }

    public void enviar(View view){
        Intent enviard = new Intent(this,Enviar_datos.class);
        startActivity(enviard);
    }
    public void integrantes(View view){
        Intent inte = new Intent(this,Integrantes.class);
        startActivity(inte);
    }
    public void reproductor(View view){
        Intent repro = new Intent(this,Reproductor.class);
        startActivity(repro);
    }
    public void tabs(View view){
        Intent ta = new Intent(this,Tabs.class);
        startActivity(ta);
    }
    public void aproximidad(View view){
        Intent aprox = new Intent(this,Aproximidad.class);
        startActivity(aprox);
    }
    public void acerca_de(View view){
        Intent acerca = new Intent(this,Acerca_de.class);
        startActivity(acerca);
    }
}