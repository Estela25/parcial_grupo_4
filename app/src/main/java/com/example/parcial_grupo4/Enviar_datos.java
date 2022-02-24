package com.example.parcial_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Enviar_datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_datos);

        final EditText eNombre =
                (EditText) findViewById(R.id.etNombre);
        final EditText eEdad = (EditText) findViewById(R.id.etEdad);
        Button bEnviar = (Button)findViewById(R.id.btEnviardatos);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText().toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("pNombre", nombre);
                pasarDatos.putString("pEdad", edad);
                Intent siga = new
                        Intent(Enviar_datos.this,Recibir_datos.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);
            }
        });
    }
    public void regresar(View view){
        Intent volver = new Intent(this,MainActivity.class);
    }
}