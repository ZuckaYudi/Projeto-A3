/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_a3;

/**
 *
 * @author Zucka
 */
public class Usuario {
    
    private String  nome;
    private String senha;
    private int idade;
    private String endereco;
    private int prioritario;
    private int administrador;
    
    
    //Construtores
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    public Usuario(String nome, int administrador) {
        this.nome = nome;
        this.administrador = administrador;
    }
    
    public Usuario (String nome, String senha, int idade, String endereco, int prioritario, int administrador) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.endereco = endereco;
        this.prioritario = prioritario;
        this.administrador = administrador;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String login) {
        this.nome = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getPrioritario() {
        return prioritario;
    }

    public void setPrioritario(int prioritario) {
        this.prioritario = prioritario;
    }

    public int getAdministrador() {
        return administrador;
    }

    public void setAdministrador(int administrador) {
        this.administrador = administrador;
    }
    
}
