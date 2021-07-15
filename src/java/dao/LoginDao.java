/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.LoginClass;
import model.Users;
import utils.JdbcUtil;

/**
 *
 * @author USER
 */
public class LoginDao {
    public boolean validate(LoginClass loginClass) throws ClassNotFoundException{
        boolean status = false;
        try(Connection connection = JdbcUtil.getConnection();
            PreparedStatement p = connection.prepareStatement("SELECT * FROM users WHERE username = ? and password = ?")){
            p.setString(1, loginClass.getUsername());
            p.setString(2, loginClass.getPassword());
            ResultSet rs = p.executeQuery();
            status = rs.next();
        }
        catch(SQLException e){
            JdbcUtil.printSQLException(e);
        }
        return status;
    }
    
    public Users getRole(LoginClass loginclass){
        Users status = null;
        //Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = JdbcUtil.getConnection();
            PreparedStatement p = connection.prepareStatement("SELECT * FROM users WHERE username = ? and password = ?")){
            p.setString(1, loginclass.getUsername());
            p.setString(2, loginclass.getPassword());
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String username = rs.getString("username");
                String password = rs.getString("password");
                status = new Users(id, firstname, lastname, username, password);
            }
            rs.close();
        }
        catch(SQLException e){
            JdbcUtil.printSQLException(e);
        }
        return status;
    }
    
//     public static void main(String[] args){
//        try{
//            LoginDao s = new LoginDao();
//            LoginClass cat = new LoginClass("admin", "admin");
//            Users sup = s.getRole(cat);
//            System.out.println(sup.getUsername());
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }  
}
