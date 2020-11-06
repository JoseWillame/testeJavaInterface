package br.edu.uni.projetoteste;

import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class Cliente implements Crud {
    private static final String TAG = "Crud";
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  String getEmail(){
        return email;
    }
    public  void setEmail(String email){
        this.email = email;
    }

    @Override
    public void incluir() {
        Log.i(TAG, "incluir: Cliente");
    }

    @Override
    public void alterar() {
        Log.i(TAG, "aterar: Cliente");
    }

    @Override
    public void deletar() {
        Log.i(TAG, "deletar: Cliente");
    }

    @Override
    public void listar() {
        Log.i(TAG, "listar: Cliente");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {

    }
}
