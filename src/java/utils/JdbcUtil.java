/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class JdbcUtil {
    private static String jdbcURL = "jdbc:mysql://sql11.freesqldatabase.com:3306/sql11425343";
    private static String jdbcUsername = "sql11425343";
    private static String jdbcPassword = "1ZrhKbH4jd";
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(con);
        return con;
    }
   
    public static void printSQLException(SQLException ex){
        for(Throwable e: ex){
            if(e instanceof SQLException){
                e.printStackTrace(System.err);
                System.err.println("SQL state: " + ((SQLException)e).getSQLState());
                System.err.println("Error code: " + ((SQLException)e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while(t != null){
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    
    public static Date getSQLDate(LocalDate date){
        return java.sql.Date.valueOf(date);
    }
    
    public static LocalDate getUtilDate(Date sqlDate){
        return sqlDate.toLocalDate();
    }
    public static void main(String[] args){
        System.out.println(JdbcUtil.getConnection());
    }
}
