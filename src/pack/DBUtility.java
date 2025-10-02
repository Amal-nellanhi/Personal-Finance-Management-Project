/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack;
import java.sql.*;

/**
 *
 * @author amaln
 */
public class DBUtility {
    public static Connection getConnection()
    {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finance_db","root","amal@123");
        } catch (SQLException ex) {
            System.getLogger(DBUtility.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return con ;
    }
}
