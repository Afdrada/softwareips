/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlBD;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class Conexion {
   private Connection conexion=null;
   static ResultSet resultado, rst;
   static Statement sentencia;
   static String bd = "mbet";
   static String Loggin= "postgres";
   static String Pass="drada123456";
   static String url="jdbc:postgresql://localhost:5432/mbet";
 
   
   public void conexionBD() throws SQLException{
       try {
           Class.forName("org.postgresql.Driver");
           conexion = DriverManager.getConnection(url, Loggin, Pass);
          if (conexion !=null){
               System.out.println("conexion establecida con la bd"+ bd);
           }
           
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   
  
            
}
