/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Users;
import utils.JdbcUtil;

/**
 *
 * @author USER
 */
public class UserDao {
    private static final String INSERT_USER = "INSERT INTO users"
            + "(firstname, lastname, username, password) VALUES " + "(?,?,?,?);";    
    public UserDao(){
        
    }

    public int saveUser(Users cat) throws ClassNotFoundException {
        int result = 0;
        try(Connection con = JdbcUtil.getConnection();
                PreparedStatement p = con.prepareStatement(INSERT_USER)){
            p.setString(1, cat.getFirstname());
            p.setString(2, cat.getLastname());
            p.setString(3, cat.getUsername());
            p.setString(4, cat.getPassword());
            result = p.executeUpdate();
        }
        catch(SQLException e){
            JdbcUtil.printSQLException(e);
        }
        return result;
    }
    
//     public static void main(String[] args){
//        try{
//            UserDao s = new UserDao();
//            Users cat = new Users("Dani", "Olora", "dan", "1234");
//            int sup = s.saveUser(cat);
//            System.out.println(sup);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }  
}
