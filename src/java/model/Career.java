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
public class Career {
    private int id;
    private String personality;
    private String field;
    private String careers;
    private String type;
    private String description;
    

    public Career(int id, String personality, String field, String careers, String type, String description) {
        this.id = id;
        this.personality = personality;
        this.field = field;
        this.careers = careers;
        this.type = type;
        this.description = description;
    }

    public Career(String personality, String field, String careers, String type, String description) {
        this.personality = personality;
        this.field = field;
        this.careers = careers;
        this.type = type;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getCareers() {
        return careers;
    }

    public void setCareers(String careers) {
        this.careers = careers;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
