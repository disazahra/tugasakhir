/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DISA
 */
    public class KoneksiDB {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]){
    
        try{
            String url="jdbc:mysql://localhost/pbo";
            String user="fatbubble";
            String pass="12345";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = (Statement) con.createStatement();
            System.out.println("Koneksi Berhasil:");
        } catch (ClassNotFoundException | SQLException e)
        {
            System.err.println("Koneksi Gagal"+e.getMessage());
        }
            
        }
    }
