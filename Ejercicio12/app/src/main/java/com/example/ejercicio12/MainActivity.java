package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
        EditText txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        EditText txtEdad = (EditText) findViewById(R.id.txtEdad);
        EditText txtEmail = (EditText) findViewById(R.id.txtEmail);

        Button btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = String.valueOf(txtNombre.getText().toString());
                String apellidos = String.valueOf(txtApellidos.getText().toString());
                int edad = Integer.parseInt(txtEdad.getText().toString());
                String email = String.valueOf(txtEmail.getText().toString());
                Persona persona = new Persona(nombre, apellidos, edad, email);

                Intent intent = new Intent(v.getContext(), MainActivity2.class);
                intent.putExtra("persona", persona);
                v.getContext().startActivity(intent);
            }
        });

    }
}