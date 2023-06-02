package com.example.jogoeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public EditText titulo, produtora, lancamento;
    public Spinner genero, plataforma;
    public RadioButton multiplayer, singleplayer;
    public Jogo jogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = (EditText) findViewById(R.id.etTitulo);
        genero = (Spinner) findViewById(R.id.spGenero);
        plataforma = (Spinner) findViewById(R.id.spPlataforma);
        produtora = (EditText) findViewById(R.id.etProdutora);
        lancamento = (EditText) findViewById(R.id.etLancamento);
    }

    void cadastrarJogo(){
        jogo = new Jogo();
        titulo.setText(jogo.getTitulo());
        genero.setSelection(adapter.getPosition(generoJogo));
        plataforma.setSelection(jogo.getPlataforma());
        modos.setText(jogo.getModos());
        produtora.setText(jogo.getProdutora());
        lancamento.setText(jogo.getLancamento());
    }
}