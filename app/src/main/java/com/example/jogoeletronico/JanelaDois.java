package com.example.jogoeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JanelaDois extends AppCompatActivity {

    private TextView tvTitulo, tvGenero, tvPlataforma, tvModos, tvProdutora, tvLancamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janela_dois);

        tvTitulo = (TextView) findViewById(R.id.tvTituloResul);
        tvGenero = (TextView) findViewById(R.id.tvGeneroResul);
        tvPlataforma = (TextView) findViewById(R.id.tvPlataformaResul);
        tvModos = (TextView) findViewById(R.id.tvModoResul);
        tvProdutora = (TextView) findViewById(R.id.tvProdutoraResul);
        tvLancamento = (TextView) findViewById(R.id.tvLancamentoResul);

        preencherCampos();
    }

    private void preencherCampos() {
        Intent intent = getIntent();
        if(intent.hasExtra("jogo")) {
            Jogo jogo;

            //Casting
            jogo = (Jogo) intent.getSerializableExtra("jogo");
            tvTitulo.setText(jogo.getTitulo());
            tvGenero.setText(jogo.getGenero());
            tvPlataforma.setText(jogo.getPlataforma());
            tvModos.setText(jogo.getModos());
            tvProdutora.setText(jogo.getProdutora());
            tvLancamento.setText(jogo.getLancamento());
        }
    }

    public void fechar(View v) {
        finish();
    }
}