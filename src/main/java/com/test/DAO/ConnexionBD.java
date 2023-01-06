package com.test.DAO;

/*
 * ConnexionBD.java
 *
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Jaber
 */
public class ConnexionBD {
private static String driver="com.mysql.jdbc.Driver";
private static String url="jdbc:mysql://localhost:3306/javaee";
private static String user="root";
private static String password="";
public static Connection connection;


   public static Connection getConnection()throws Exception{
            Class.forName(driver);
           return connection = DriverManager.getConnection(url, user,password);
   }

   public static void Sedeconnecter() throws Exception{
   connection.close();

   }




}
