package aula.engenharia.semSpring;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GravaSemSpring {

    String driver = "org.postgresql.Driver";
    String url = "jdbc:postgresql://localhost:5432/spring";
    String usuario = "postgres";
    String senha = "061290";
    Connection conexao;
    Statement statement;
    ResultSet resultSet;

    public static void main(String[] args) {
        new GravaSemSpring();
    }

    public GravaSemSpring() {
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            statement = conexao.createStatement(resultSet.TYPE_SCROLL_SENSITIVE, resultSet.CONCUR_READ_ONLY);
            String sql = "insert into pessoa (nome, endereco, telefone) values ('matheus', 'rua nove', '2451254')";
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Gravado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de sql: " + ex);
            Logger.getLogger(GravaSemSpring.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro de driver: " + ex);
            Logger.getLogger(GravaSemSpring.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
