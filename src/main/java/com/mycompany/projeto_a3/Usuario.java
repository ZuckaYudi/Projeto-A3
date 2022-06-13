package com.mycompany.projeto_a3;

public class Usuario {

    private int id;
    private String nome;
    private String senha;
    private int idade;
    private String endereco;
    private int prioritario;
    private int administrador;

    //Construtores

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Usuario (int id){
        this.id = id;
    }
    
    
    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(String nome, int administrador) {
        this.nome = nome;
        this.administrador = administrador;
    }
    
    public Usuario(int id, int prioritario) {
        this.id = id;
        this.prioritario = prioritario;
    }
    
    public Usuario(int prioritario, String nome) {
        this.prioritario = prioritario;
        this.nome = nome;
    }

    public Usuario(String nome, int idade, String senha, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
        this.endereco = endereco;
    }

    public Usuario(String nome, String senha, int idade, String endereco, int prioritario, int administrador) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.endereco = endereco;
        this.prioritario = prioritario;
        this.administrador = administrador;
    }
    
    public Usuario(int id, String nome, String senha, int idade, String endereco, int prioritario, int administrador) {
        this.id = id;
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

    @Override
    public String toString() {
        return this.nome;
    }

}
