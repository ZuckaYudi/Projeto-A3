package com.mycompany.projeto_a3;

// Depdendencias
import java.sql.Connection;
import java.sql.DriverManager;

//Classe
public class ConexaoBD {
 private static String host = "localhost";
 private static String porta = "3306";
 private static String db = "usuarios_sistema";
 private static String usuario = "root";
 private static String senha = "Coletiva1!";

 //Conexao com banco
 public static Connection obterConexao () throws Exception{
    String url = String.format(
    "jdbc:mysql://localhost:3306/usuarios_sistema?useTimezone=true&serverTimezone=UTC",
    host,
    porta,
    db
 );
    return DriverManager.getConnection(url, usuario, senha);
 }
}
