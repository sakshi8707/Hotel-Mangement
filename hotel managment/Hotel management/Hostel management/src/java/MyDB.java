/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oops
 */
public class MyDB {
    Connection con;
    public Connection getCon(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyDB.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println(ex);
        }
    return con;
    }
    
}
