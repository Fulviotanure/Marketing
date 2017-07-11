package marketing.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import marketing.model.Campanha;
import marketing.model.Praca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fulvio
 */
public class PracaDAO {
    
    private Connection conexao;
    
     public PracaDAO() {
        conexao = ConnectionFactory.getConnection();
    }
    
       public boolean inserirPraca(Praca praca) {

        boolean resultado = false;

        String sql = "insert into tb_praca (nome, tipo, valor_diario ) values (?,?,?)";

        try {
            conexao.setAutoCommit(false);
            
            PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, praca.getNome());
            stmt.setString(2, praca.getTipo());
            stmt.setDouble(3, praca.getValor_diario());
            
           

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.first();
            int codigo = rs.getInt(1);
            praca.setId_praca(codigo);
            stmt.close();

            conexao.commit();
            resultado = true;
            
        } catch (SQLException ex) {
            try {
                conexao.rollback();
            } catch (SQLException ex1) {
               JOptionPane.showMessageDialog(null,"Erro ao reverter a operação - " + ex1.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null,"Erro ao inserir a praca - " + ex.getMessage());
        } finally {

            try {
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao fechar conexão - " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        return resultado;
    }



// Gera um objeto a partir da extrutura do banco de dados
    public static Praca extrairObjeto(ResultSet rs) throws SQLException {
        Praca p = null;
        
        try{
            int id = rs.getInt("id_praca");
            
            if(!rs.wasNull()){
                p = new Praca();

                p.setId_praca(rs.getInt("id_praca"));
                p.setNome(rs.getString("nome"));
                p.setTipo(rs.getString("tipo"));
                p.setValor_diario(rs.getDouble("valor_diario"));
            }
        }
        catch(SQLException e){
            throw e;
        }
        
        return p;
    }

public static Praca Buscar(String nome) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Praca p = null;
        
        try{
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tab_praca " +
                " WHERE nome = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, nome);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
            if (rs.next()) {

                p = PracaDAO.extrairObjeto(rs);

             } 
        } catch(Exception e){
            // Caso ocorra excecao envia para metodo que
            //o chamou
            throw e;
        }finally{
            // Fecha conexao
            if(conn != null)
                conn.close();
        }
        
        return p;
    }


public static ArrayList listar() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Praca> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tb_praca " ;

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Praca p = new Praca();
            
            p.setId_praca(rs.getInt("id_praca"));
            p.setNome(rs.getString("nome"));
            p.setTipo(rs.getString("tipo"));
            p.setValor_diario(rs.getDouble("valor_diario"));
            
            
            //se quiser pegar a hora tambem
            //p.setDtCadastro(rs.getTimestamp("dt_cadastro")); 
            
            
            lista.add(p);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }
  /*  public static ArrayList listar(String nomePesquisa) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Praca> lista = new ArrayList<>();
                
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tab_praca WHERE nome like ? ";

        preparedStatement = conn.prepareStatement(SQL);
        
        nomePesquisa = "%" + nomePesquisa + "%";
        
        preparedStatement.setString(1, nomePesquisa);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
            Praca p = new Praca();
            
            p.setId_praca(rs.getInt("id_praca"));
            p.setNome(rs.getString("nome"));
            p.setTipo(rs.getString("tipo"));
            p.setValor_diario(rs.getDouble("valor_diario"));
            
            lista.add(p);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }*/

   public static void excluir(Praca p) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        try{
            // Obtem conexao com BD
            conn = ConnectionFactory.getConnection();

            // Comando SQL 
            SQL = "DELETE FROM tb_praca " +
                  "WHERE id_praca = ? ";

            preparedStatement = conn.prepareStatement(SQL);

            preparedStatement.setInt(1, p.getId_praca());
       
            
            // Executa comando no banco
            preparedStatement.executeUpdate();  

        } catch(Exception e){
            // Caso ocorra excecao envia para metodo que
            //o chamou
            throw e;
        }finally{
            // Fecha conexao
            if(conn != null)
                conn.close();
        }       
        
    }

}