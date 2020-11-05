package com.example.intentparapasardatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.intentparapasardatos.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnEnviar = findViewById(R.id.btnEnviar);
        final EditText txtTexto = findViewById(R.id.txtTexto);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enviardatos = new Intent(MainActivity.this,Segunda.class);
                String texto = txtTexto.getText().toString();
                enviardatos.putExtra(EXTRA_MESSAGE,texto);
                startActivity(enviardatos);
            }
        });
    }
}