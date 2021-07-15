/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class LoginClass {
    private static final long serialVersionUID = 1L;
    private int id;
    private String username;
    private String password;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public LoginClass(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public LoginClass(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
}
