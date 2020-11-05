package com.example.intentparapasardatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        final TextView txtResultado = findViewById(R.id.txtResultado);

        Intent recibirDatos = getIntent();
        String textRecibido = recibirDatos.getStringExtra(MainActivity.EXTRA_MESSAGE);
        txtResultado.setText("Hola \n"+textRecibido);

    }
}