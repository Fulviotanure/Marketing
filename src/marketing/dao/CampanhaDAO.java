package marketing.dao;

import marketing.model.Campanha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CampanhaDAO {

    private Connection conexao;

    public CampanhaDAO() {
        conexao = ConnectionFactory.getConnection();
    }

    public boolean inserirCampanha(Campanha campanha) {

        boolean resultado = false;

        String sql = "insert into tb_campanha (nome, periodo, valor, descricao ) values (?,?,?,?)";

        try {
            conexao.setAutoCommit(false);
            
            PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, campanha.getNome());
            stmt.setString(2, campanha.getPeriodo());
            stmt.setDouble(3, campanha.getValor());
            stmt.setString(4, campanha.getDescricao());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.first();
            int codigo = rs.getInt(1);
            campanha.setId_campanhas(codigo);
            stmt.close();

            
            
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

    

}
