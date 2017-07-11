package marketing.dao;

import marketing.model.Campanha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CampanhaDAO {

    private Connection conexao;

    public CampanhaDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    public boolean inserirCampanha(Campanha campanha) {

        boolean resultado = false;

        String sql = "insert into tb_campanha (nome, periodo, valor, descricao, link ) values (?,?,?,?,?)";

        try {
            conexao.setAutoCommit(false);
            
            PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, campanha.getNome());
            stmt.setString(2, campanha.getPeriodo());
            stmt.setDouble(3, campanha.getValor());
            stmt.setString(4, campanha.getDescricao());
            stmt.setString(5, campanha.getLink());
            

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.first();
            int codigo = rs.getInt(1);
            campanha.setId_campanhas(codigo);
            stmt.close();

             conexao.commit();
            resultado = true;
            
        } catch (SQLException ex) {
            try {
                conexao.rollback();
            } catch (SQLException ex1) {
               JOptionPane.showMessageDialog(null,"Erro ao reverter a operação - " + ex1.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null,"Erro ao inserir a campanha - " + ex.getMessage());
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
    public static Campanha extrairObjeto(ResultSet rs) throws SQLException {
        Campanha c = null;
        
        try{
            int id = rs.getInt("id_campanha");
            
            if(!rs.wasNull()){
                c = new Campanha();

                c.setId_campanhas(rs.getInt("id_campanha"));
                c.setNome(rs.getString("nome"));
                c.setPeriodo(rs.getString("periodo"));
                c.setValor(rs.getDouble("valor"));
                c.setLink(rs.getString("link"));
            }
        }
        catch(SQLException e){
            throw e;
        }
        
        return c;
    }

public static Campanha Buscar(String nome) throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        Campanha c = null;
        
        try{
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tab_campanha " +
                " WHERE nome = ? ";

        preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, nome);
                
        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
            if (rs.next()) {

                c = CampanhaDAO.extrairObjeto(rs);

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
        
        return c;
    }


public static ArrayList listar() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        ArrayList<Campanha> lista = new ArrayList();
        
        // Obtem conexao com BD
        conn = ConnectionFactory.getConnection();
        
        // Comando SQL 
        SQL = "SELECT * FROM tb_campanha " ;

        preparedStatement = conn.prepareStatement(SQL);

        // Para buscar informações
        rs = preparedStatement.executeQuery();   

        // Verifica se possui dados
        while (rs.next()) {
            
           Campanha c = new Campanha();
            
                c.setId_campanhas(rs.getInt("id_campanha"));
                c.setNome(rs.getString("nome"));
                c.setPeriodo(rs.getString("periodo"));
                c.setValor(rs.getDouble("valor"));
                c.setLink(rs.getString("link"));
            
            
            //se quiser pegar a hora tambem
            //p.setDtCadastro(rs.getTimestamp("dt_cadastro")); 
            
            
            lista.add(c);
         } 
        
        // Fechar conexao
        conn.close();
        
        return lista;
    }


   public static void excluir(Campanha c) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        PreparedStatement  preparedStatement = null;
        ResultSet rs = null;
        String SQL = "";
        
        try{
            // Obtem conexao com BD
            conn = ConnectionFactory.getConnection();

            // Comando SQL 
            SQL = "DELETE FROM tb_campanha " +
                  "WHERE id_campanha = ? ";

            preparedStatement = conn.prepareStatement(SQL);

            preparedStatement.setInt(1, c.getId_campanhas());
           
         
       
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