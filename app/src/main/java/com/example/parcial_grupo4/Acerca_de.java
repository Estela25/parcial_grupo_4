package com.example.parcial_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Acerca_de extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }

    public void regresar(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}