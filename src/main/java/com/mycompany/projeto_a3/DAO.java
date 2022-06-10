package com.mycompany.projeto_a3;

//Depencias
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Classe
public class DAO {

    public boolean existe(Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuarios WHERE nome = ? AND senha = ?";

        try ( Connection conn = ConexaoBD.obterConexao();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());

            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public boolean validaAdm(Usuario usuario) throws Exception {
        String sql = "SELECT * FROM tb_usuarios WHERE nome = ? AND administrador = ?";

        try ( Connection conn = ConexaoBD.obterConexao();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setInt(2, usuario.getAdministrador());

            try ( ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public Usuario[] obterUsuario() throws Exception {
        String sql = "SELECT * FROM tb_usuarios";
        try ( Connection conn = ConexaoBD.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);  ResultSet rs = ps.executeQuery()) {

            int totalDeUsuarios = rs.last() ? rs.getRow() : 0;
            Usuario[] usuarios = new Usuario[totalDeUsuarios];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String senha = rs.getString("senha");
                String endereco = rs.getString("endereco");
                usuarios[contador++] = new Usuario(nome, idade, senha, endereco);
            }
            return usuarios;
        }
    }

    public void inserirUsuario(Usuario usuario) throws Exception {
        String sql = "INSERT INTO tb_usuarios (nome, senha, idade, endereco, prioritario, administrador) VALUES (?, ?, ?, ?, ?, ?);";
        try ( Connection conexao = ConexaoBD.obterConexao();  PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.setInt(3, usuario.getIdade());
            ps.setString(4, usuario.getEndereco());
            ps.setInt(5, usuario.getPrioritario());
            ps.setInt(6, usuario.getAdministrador());
            ps.execute();
        }
    }

    public void atualizarUsuario(Usuario usuario) throws Exception {
        String sql = "UPDATE tb_usuarios SET senha = ?, idade = ?, endereco = ?, prioritario = ?, administrador = ? WHERE nome = ? and senha = ?";
        try (Connection conexao = ConexaoBD.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)){
            ps.setString(1, usuario.getSenha());
            ps.setInt(2, usuario.getIdade());
            ps.setString(3, usuario.getEndereco());
            ps.setInt(4, usuario.getPrioritario());
            ps.setInt(5, usuario.getAdministrador());
            ps.setString(6, usuario.getNome());
            ps.setString(7, usuario.getSenha());
            
            ps.execute();
        }
    }
    
    public void removerUsuario (Usuario usuario) throws Exception {
        String sql = "DELETE FROM tb_usuarios WHERE nome = ? and senha = ?";
        try (Connection conexao = ConexaoBD.obterConexao();
                PreparedStatement ps = conexao.prepareStatement (sql);) {
            ps.setString (1, usuario.getNome());            
            ps.setString (2, usuario.getSenha());
            
            ps.execute();
        }
            
    }

}
