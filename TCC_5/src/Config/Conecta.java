/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class Conecta {

    public static Connection conn;
    //constantes com valores de conexao
    private final static String DRIVER = "org.postgresql.Driver";
    private final static String NOMEBD = "banco_hanbai";
    private final static String URL = "jdbc:postgresql://localhost:5432/" + NOMEBD;
    private final static String USER = "postgres";
    private final static String SENHA = "postgres";

    public static boolean getConexao() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, SENHA);
            System.out.println("Conexao realizada com sucess");
            return true;
        } catch (ClassNotFoundException ex) {
            System.out.println("problema com o driver! \n" + ex.toString());
            return false;
        } catch (SQLException e) {
            System.out.println("erro na conexao com o banco \n" + e.toString());
            return false;
        }

    }

    public void close() {
        try {
            conn.close();
            System.out.println("Conexao encerrada com sucesso");
        } catch (SQLException e) {
            System.out.println("erro na conexao com o banco");
        }
    }
}
