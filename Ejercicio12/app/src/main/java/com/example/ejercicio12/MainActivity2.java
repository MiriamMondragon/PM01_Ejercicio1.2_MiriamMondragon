package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity2 extends AppCompatActivity implements Serializable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView lblNombre = (TextView) findViewById(R.id.lblNombre);
        TextView lblApellidos = (TextView) findViewById(R.id.lblApellidos);
        TextView lblEdad = (TextView) findViewById(R.id.lblEdad);
        TextView lblEmail = (TextView) findViewById(R.id.lblEmail);

        Intent intent = getIntent();
        Persona persona = (Persona) intent.getSerializableExtra("persona");
        lblNombre.setText(persona.getNombre());
        lblApellidos.setText(persona.getApellidos());
        lblEdad.setText(String.valueOf(persona.getEdad()));
        lblEmail.setText(persona.getEmail());
    }
}