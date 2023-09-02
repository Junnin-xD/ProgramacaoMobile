package Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Models;

public class DaoModels {

    public Connection conexao() {

        Connection c = null;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            c = DriverManager.getConnection("jdbc:sqlite:dbtabela.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    public void salvarDB(Models models) {
        
        System.out.println("teste");
        String sql = "insert into tbl_contas (cont_nome, cont_classificacao, cont_valor, cont_data, cont_ganho, cont_gasto) values (?, ?, ?, ?, ?, ?)";

        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new DaoModels().conexao();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, models.getCont_nome());
            pStatement.setString(2, models.getCont_classificacao());
            pStatement.setDouble(3, models.getCont_valor());
            pStatement.setString(4, models.getCont_data());
            pStatement.setBoolean(5, models.isCont_ganho());
            pStatement.setBoolean(6, models.isCont_gasto());
            pStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao fechar o Statement: " + e);
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e);
            }
        }

    }

    public List<Models> buscaModel() {

        String selectsql = "select * from tbl_contas";

        PreparedStatement pstm = null;
        Connection connection = null;
        ArrayList<Models> entity = new ArrayList<>();

        try {

            connection = new DaoModels().conexao();
            pstm = connection.prepareStatement(selectsql);
            ResultSet rs = pstm.executeQuery();

            // passa por todas as linhas retornadas do bd e add na listEntradas
            while (rs.next()) {
                Models models = new Models(
                        rs.getInt("pk_cont_id"),
                        rs.getString("Cont_nome"),
                        rs.getString("Cont_classificacao"),
                        rs.getDouble("Cont_valor"),
                        rs.getString("Cont_data"),
                        rs.getBoolean("Cont_ganho"),
                        rs.getBoolean("Cont_gasto"));

                entity.add(models);
            }
            return entity;
        } catch (SQLException e) {
            System.out.println("Erro ao fechar o Statement: " + e);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e);
            }
        }
        return null;

    }

    public void deletar(int id) {

        String sql = "delete from tbl_contas where pk_cont_id = " + id;
        System.out.println(sql);

        PreparedStatement pStatement = null;
        Connection connection = null;

        try {
            connection = new DaoModels().conexao();
            pStatement = connection.prepareStatement(sql);
            
            pStatement.executeUpdate();
            System.out.println("Deletado com sucesso");


        } catch (SQLException e) {
            System.out.println("Erro ao fechar o Statement: " + e);
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar o Statement: " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e);
            }
        }

    }

}
