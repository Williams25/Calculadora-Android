package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    EditText n1,n2;
    Button soma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        resultado = findViewById(R.id.Resultado);
        n1 = findViewById(R.id.edN1);
        n2 = findViewById(R.id.edN2);
        soma = findViewById(R.id.bSoma);

        resultado.setText("");

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Calculadora c = new Calculadora(); // Instanciando a class Calculadora responsavel por conter metodos de somo e multiplicação
             if (!n1.getText().toString().equals("") && !n2.getText().toString().equals("")){ // Verifica se os campos são diferented de vazio
                 Double resultadoSoma = c.soma(n1.getText().toString(),n2.getText().toString()); // Chamando o metodo de soma e passando os parametros e retornando o resultado em uma variavel do tipo double
                 Double resultadoMultip = c.multiplicacao(n1.getText().toString(),n2.getText().toString()); // Chamando o metodo de multiplicação e passando os parametros e retornando o resultado em uma variavel do tipo double
                 resultado.setText("Total soma: "+resultadoSoma.toString() +"\nTotal Multiplicação: "+ resultadoMultip); // Retornando o resultado das operações na tela
             } else Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show(); // Caso algum valor dos campos seja vazio ele vai retornar uma mensagem de erro
            }
        });
    }
}
