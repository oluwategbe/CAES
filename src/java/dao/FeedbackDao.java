/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Feedback;
import utils.JdbcUtil;

/**
 *
 * @author USER
 */
public class FeedbackDao {
    private static final String INSERT_CAT = "INSERT INTO feedback"
            + "(username, likee, feedback) VALUES " + "(?,?,?);";
    
    public int saveFeedback(Feedback cat) throws ClassNotFoundException {
        int result = 0;
        try(Connection con = JdbcUtil.getConnection();
                PreparedStatement p = con.prepareStatement(INSERT_CAT)){
            p.setString(1, cat.getUsername());
            p.setString(2 ,cat.getLike());
            p.setString(3, cat.getFeedback());
            result = p.executeUpdate();
        }
        catch(SQLException e){
            JdbcUtil.printSQLException(e);
        }
        return result;
    }
    
//    public static void main(String[] args){
//        try{
//            FeedbackDao s = new FeedbackDao();
//            Feedback feed = new Feedback("pelsky", "Yes", "I loved it");
//            int sup = s.saveFeedback(feed);
//            System.out.println(sup);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    } 
}
