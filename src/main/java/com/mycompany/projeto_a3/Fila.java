package com.mycompany.projeto_a3;

public class Fila {
    private int id;
    private String nome;
    private int prioritario;

    public Fila (int id, String nome, int prioritario){
        this.id = id;
        this.nome = nome;
        this.prioritario = prioritario;
    }
    
    public Fila (int id) {
        this.id = id;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioritario() {
        return prioritario;
    }

    public void setPrioritario(int prioritario) {
        this.prioritario = prioritario;
    }
    
    @Override
    public String toString() {
    return this.nome;
    }   

}
