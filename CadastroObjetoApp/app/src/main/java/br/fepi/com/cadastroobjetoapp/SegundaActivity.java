package br.fepi.com.cadastroobjetoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {

    TextView textViewNome, textViewPreco, textViewQuantidade;
    private Button buttonRetornar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);

        textViewNome = findViewById(R.id.nome_segunda);
        textViewPreco = findViewById(R.id.preco_segunda);
        textViewQuantidade = findViewById(R.id.quantidade_segunda);
        buttonRetornar = findViewById(R.id.retornar);

        Objeto objeto = (Objeto) getIntent().getSerializableExtra("PRODUTO");

        textViewNome.setText("NOME: " + objeto.getNome());
        textViewPreco.setText("Preço: "+ objeto.getPreco());
        textViewQuantidade.setText("Quantidade: "+ objeto.getQuantidade());

        finish();

        buttonRetornar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Enviar o objeto para a segunda tela (Parte 2)

            }
        });
    }


}