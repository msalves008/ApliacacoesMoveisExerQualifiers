package br.fasam.exer_qualifiers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view) {
        // entrada
        txtMarca = findViewById(R.id.txtMarca);
        txtModelo = findViewById(R.id.txtModelo);
        txtCor = findViewById(R.id.txtCor);
        txtEspecificacoes = findViewById(R.id.txtEspecificacoes);
        txtTamanho = findViewById(R.id.txtTamanho);

        //processamento
        String marca, modelo, cor, especicacoes, tamanho;
        marca = txtMarca.getText().toString();
        modelo = txtModelo.getText().toString();
        cor = txtCor.getText().toString();
        especicacoes = txtEspecificacoes.getText().toString();
        tamanho = txtTamanho.getText().toString();

        //saida

        String dados = String.format("Os dados digitados foram: marca: %s\n modelo %s\n cor %s\n especicacoes %s\n tamanho: %s ", marca, modelo, cor, especicacoes, tamanho);
        Toast.makeText(this, dados, Toast.LENGTH_LONG).show();
    }
}