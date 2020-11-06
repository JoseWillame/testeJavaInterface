package br.edu.uni.projetoteste;

import android.util.Log;

public class Produto implements Crud{
    private static final String TAG = "Crud";
    private String nomeProduto;
    private String fornecedor;

    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public  String getFornecedor(){
        return fornecedor;
    }
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }

    @Override
    public void incluir() {
        Log.i(TAG, "incluir: Produto");
    }

    @Override
    public void alterar() {
        Log.i(TAG, "alterar: Produto");
    }

    @Override
    public void deletar() {
        Log.i(TAG, "deletar: Produto");
    }

    @Override
    public void listar() {
        Log.i(TAG, "listar: Produto");
    }
    /**
   *  @param args
   */

}
