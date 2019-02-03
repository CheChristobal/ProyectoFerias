/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Cristobal
 */
public class conectar {
    public static PreparedStatement prest=null;
    public static CallableStatement cllst=null;
    public static Connection conec=null;
    public static Statement st=null;
    public static ResultSet rt=null;
    public static String db;
    
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conec=DriverManager.getConnection("jdbc:mysql://localhost/ferianavideña","root","");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        return conectar;
    }
}
