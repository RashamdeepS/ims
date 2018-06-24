package com.parvs.management.ims.model;

import lombok.Data;
//import javax.persistence.Entity;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="EMPLOYEE")
public class User {
 /*   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private BigDecimal price;*/
    protected User() {
    }
    @Id
    private Integer id;
    
    private String username;

    public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	private String password;
 
      
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


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}