package com.example.jogoeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public EditText titulo, produtora, lancamento;
    public Spinner genero, plataforma;
    public String modo;
    public RadioButton multiplayer;
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
        multiplayer = (RadioButton) findViewById(R.id.rbMultiplayer);
        RadioGroup radioGroup = findViewById(R.id.RadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rbSingleplayer) {
                    modo = "Singleplayer";
                } else if (checkedId == R.id.rbMultiplayer) {
                    modo = "Multiplayer";
                }
            }
        });

    }

    void cadastrarJogo(){
        jogo = new Jogo();

        jogo.setTitulo(titulo.getText().toString());
        jogo.setGenero((String) genero.getSelectedItem());
        jogo.setPlataforma((String) plataforma.getSelectedItem());
        jogo.setModos(modo);
        jogo.setProdutora(String.valueOf(produtora.getText()));
        jogo.setLancamento(String.valueOf(lancamento.getText()));
        jogo.setImg("R.drawable.fortnite");
    }

    public void cadastrar(View v){
        cadastrarJogo();
        Intent intent = new Intent(this, JanelaDois.class);
        intent.putExtra("jogo", jogo);
        startActivity(intent);
    }

    public void limpar(View v){
        titulo.setText("");
        genero.setSelection(1);
        plataforma.setSelection(1);
        multiplayer.setChecked(true);
        produtora.setText("");
        lancamento.setText("");
    }

    public void fechar(View v){
        finish();
    }
}