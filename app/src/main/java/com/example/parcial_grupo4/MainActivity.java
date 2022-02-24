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
    }
    public void aproximidad(View view){
        Intent aprox = new Intent(this,Aproximidad.class);
    }
    public void enviar(View view){
        Intent enviard = new Intent(this,Enviar_datos.class);
    }
    public void integrantes(View view){
        Intent inte = new Intent(this,Integrantes.class);
    }
    public void reproductor(View view){
        Intent repro = new Intent(this,Reproductor.class);
    }
    public void tabs(View view){
        Intent ta = new Intent(this,Tabs.class);
    }
}