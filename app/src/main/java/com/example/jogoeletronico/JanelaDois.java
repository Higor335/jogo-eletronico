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
        if(intent.hasExtra("pessoa")) {
            Pessoa pessoa;

            //Casting
            pessoa = (Pessoa) intent.getSerializableExtra("pessoa");
            tvTitulo.setText(pessoa.getTitulo());
            tvGenero.setText(pessoa.getGenero());
            tvPlataforma.setText(pessoa.getPlataforma());
            tvModos.setText(pessoa.getModos());
            tvProdutora.setText(pessoa.getProdutora());
            tvLancamento.setText(pessoa.getLancamento());
        }
    }

    public void fechar(View v) {
        finish();
    }
}