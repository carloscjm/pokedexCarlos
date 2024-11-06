package br.fepi.com.cadastroobjetoapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    private EditText editTextNome, editTextPreco, editTextQuantidade;
    private Button buttonCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNome = findViewById(R.id.nome);
        editTextPreco = findViewById(R.id.preco);
        editTextQuantidade = findViewById(R.id.quantidade);
        buttonCadastrar = findViewById(R.id.cadastrar);

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Capturar os dados inseridos
                String nome = editTextNome.getText().toString();
                double preco = Double.parseDouble(editTextPreco.getText().toString());
                int quantidade = Integer.parseInt(editTextQuantidade.getText().toString());

                // Criar o objeto Produto
                Objeto objeto = new Objeto(nome, preco, quantidade);

                // Enviar o objeto para a segunda tela (Parte 2)
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("PRODUTO", objeto);
                startActivity(intent);
            }
        });


    }
}