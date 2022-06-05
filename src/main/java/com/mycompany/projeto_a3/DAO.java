package com.mycompany.projeto_a3;

//Depencias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Classe
public class DAO {
 public boolean existe (Usuario usuario) throws Exception{
    String sql = "SELECT * FROM tb_usuarios WHERE nome = ? AND senha = ?";
    
    try (Connection conn = ConexaoBD.obterConexao();
    PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getSenha());
    
    try (ResultSet rs = ps.executeQuery()){
        return rs.next();
    }
   }
 }
 
 public boolean validaAdm (Usuario usuario) throws Exception{
    String sql = "SELECT * FROM tb_usuarios WHERE nome = ? AND administrador = ?";
    
    try (Connection conn = ConexaoBD.obterConexao();
    PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1, usuario.getNome());
        ps.setInt(2, usuario.getAdministrador());
    
    try (ResultSet rs = ps.executeQuery()){
        return rs.next();
    }
   }
 }
}