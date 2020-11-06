package br.edu.uni.projetoteste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cliente objCliente;
    Produto objProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente();
        objProduto = new Produto();

        objCliente.setNome("name");
        objCliente.setEmail("teste@teste.com.br");

        objCliente.incluir();
        objCliente.alterar();
        objCliente.deletar();
        objCliente.listar();

    }
}