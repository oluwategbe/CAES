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
import model.Career;
import utils.JdbcUtil;

/**
 *
 * @author USER
 */
public class CareerDao {
    private static final String INSERT_CAT = "INSERT INTO careers"
            + "(personality, field, career, type, description) VALUES " + "(?,?,?,?,?);";
    private static final String FIND_CAT = "SELECT career from careers WHERE personality = ? AND field = ?;";
    private static final String SELECT_TYPE = "SELECT type from careers WHERE personality = ? AND field = ?;";
    private static final String SELECT_DESC = "SELECT description from careers WHERE personality = ? AND field = ?;";
    
    public int saveCareer(Career cat) throws ClassNotFoundException {
        int result = 0;
        try(Connection con = JdbcUtil.getConnection();
                PreparedStatement p = con.prepareStatement(INSERT_CAT)){
            p.setString(1, cat.getPersonality());
            p.setString(2 ,cat.getField());
            p.setString(3, cat.getCareers());
            p.setString(4, cat.getType());
            p.setString(5, cat.getDescription());
            result = p.executeUpdate();
        }
        catch(SQLException e){
            JdbcUtil.printSQLException(e);
        }
        return result;
    }
    
    public String selectCareers(String personality, String field) {
        String careers = " ";
        try(Connection con = JdbcUtil.getConnection();
                PreparedStatement p = con.prepareStatement(FIND_CAT)){
            p.setString(1, personality);
            p.setString(2, field);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                careers = rs.getString("career");
            }
            rs.close();
        }
        catch(SQLException e){
            JdbcUtil.printSQLException(e);
        }
        return careers;
    }
    
    public String selectType(String personality, String field) {
        String type = " ";
        try(Connection con = JdbcUtil.getConnection();
                PreparedStatement p = con.prepareStatement(SELECT_TYPE)){
            p.setString(1, personality);
            p.setString(2, field);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                type = rs.getString("type");
            }
            rs.close();
        }
        catch(SQLException e){
            JdbcUtil.printSQLException(e);
        }
        return type;
    }
    
    public String selectDescription(String personality, String field) {
        String description = " ";
        try(Connection con = JdbcUtil.getConnection();
                PreparedStatement p = con.prepareStatement(SELECT_DESC)){
            p.setString(1, personality);
            p.setString(2, field);
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                description = rs.getString("description");
            }
            rs.close();
        }
        catch(SQLException e){
            JdbcUtil.printSQLException(e);
        }
        return description;
    }
//    public static void main(String[] args){
//        try{
//            CareerDao s = new CareerDao();
//            String a = s.selectCareers("ESTJ", "science");
//            String b = s.selectType("ESTJ", "science");
//            String c = s.selectDescription("ESTJ", "science");
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }  
}
