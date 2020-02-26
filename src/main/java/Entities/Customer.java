/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author mikke
 */
@Entity
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String FirstName; 
    private String LastName; 
    @OneToOne
    private Adress adress; 
    
    
    
    
    
    @ElementCollection
    @CollectionTable(
    name="hobby", 
    joinColumns = @JoinColumn(name = "id") )
    @Column(name="hobby_name")
    private List<String> hobbies = new ArrayList();
    
    
    public void addHobby (String s) {
        hobbies.add(s); 
    }
    
    private String getHobbies () {
        return String.join(",", hobbies); 
    }
    

    public Customer() {
    }

    public Customer(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    
    

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
    
}