package marketing.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        String sql = "insert into tb_campanha (nome, tipo, valor_diario ) values (?,?,?)";

        try {
            conexao.setAutoCommit(false);
            
            PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, praca.getNome());
            stmt.setString(2, praca.getTipo());
            stmt.setDouble(2, praca.getValor_diario());
            
           

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.first();
            int codigo = rs.getInt(1);
            praca.setId_praca(codigo);
            stmt.close();

            
            
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
}
