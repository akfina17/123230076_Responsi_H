/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Model;

import java.sql.*;

/**
 *
 * @author Lab Informatika
 */
public class Connector {
    private static String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    private static String nama_db = "cattycare";
    private static String url_db = "jdbc:mysql://localhost:3306/" + nama_db;
    private static String username_db = "root";
    private static String password_db = "";
    
    static Connection conn;
    
    public static Connection Connect(){
        try{
            Class.forName(jdbc_driver);
            conn = DriverManager.getConnection(url_db, username_db, password_db);
            System.out.println("MySQL Connected");
        }
        catch (ClassNotFoundException | SQLException exception){
            System.out.println("Connection Failed:" + exception.getLocalizedMessage());
        }
        return conn;
    }
}
