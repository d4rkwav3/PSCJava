
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author d4rkwav3
 */
public class DAO {
    public boolean existe (Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuarios WHERE nome =? AND senha =?";
        
        try(Connection conn = ConexaoBD.obterConexao(); 
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    
    public Curso [] obterCursos () throws Exception {
        String sql = "SELECT * FROM tb_cursos";
        
        try (Connection conn = ConexaoBD.obterConexao();
             PreparedStatement ps = conn.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = ps.executeQuery()) {
            
            int totalDeCursos = rs.last() ? rs.getRow() : 0;
            Curso [] cursos = new Curso[totalDeCursos];
            rs.beforeFirst();
            int contador = 0;
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String tipo = rs.getString("tipo");
                cursos[contador++] = new Curso (id, nome, tipo);
            }
            return cursos;
        }
    }
    
    public void inserirCurso (Curso curso) throws Exception {
        String sql = "INSERT INTO tb_cursos (nome, tipo) VALUES (?, ?);";
        
        try (Connection conexao = ConexaoBD.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getTipo());
            ps.execute();
        }
    }
    
      public void atualizarCurso (Curso curso) throws Exception {
        String sql = "UPDATE tb_cursos SET nome = ?, tipo = ? WHERE id = ?";
        
        try (Connection conexao = ConexaoBD.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getTipo());
            ps.setInt(3, curso.getId());
            ps.execute();
        }
    }
      public void removerCurso (Curso curso) throws Exception {
          String sql = "DELETE FROM tb_cursos WHERE id = ?";
          
          try (Connection conexao = ConexaoBD.obterConexao();
                  PreparedStatement ps = conexao.prepareStatement(sql);) {
              ps.setInt(1, curso.getId());
              ps.execute();
          }
      }
}
