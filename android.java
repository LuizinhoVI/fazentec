package com.example.fazentech.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fazentech.R;

public class MainActivity extends AppCompatActivity {
    private Button buttonCadastro;
    private Button buttonListaProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCadastro = findViewById(R.id.buttonCadastro);
        buttonCadastro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Cadastro.class);
                startActivity( intent);

            }
        });

        buttonListaProdutos = findViewById(R.id.buttonListaProdutos);
        buttonListaProdutos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListaProdutos.class);
                startActivity( intent);

            }
        });
    }
}
