/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author sidhu376
 */
public class Student {

    private String name;
    private String program;
    private String status;

    /**
     * hi 
     */
    /**
    
    /** this is an edit on github/**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_NAME = "name";

}
