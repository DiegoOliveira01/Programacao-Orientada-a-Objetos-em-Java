/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author diego
 */

public class ClienteDAO {
    public static void main(String[] args) {
        Connection conn = ConnectionFactory.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM cliente");
            ResultSet rs = stmt.executeQuery();
            
            System.out.println("Dados da tabela minha_tabela:");
            System.out.println("ID\tNome\tIdade");
            
            while (rs.next()) {
                String id = rs.getString("idCliente");
                String nome = rs.getString("nome");
                String idade = rs.getString("endereco");
                
                System.out.println(id + "\t" + nome + "\t" + idade);
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}





