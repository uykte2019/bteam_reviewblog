package com.teamb.blog.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user")
@JsonIgnoreProperties(ignoreUnknown = true)
//@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class User {
	
	@Id
	@Column(name = "username", columnDefinition = "jsonb")
	//@Type(type = "jsonb")
	private String username;
	
	@Column(name = "password", columnDefinition = "jsonb")
	//@Type(type = "jsonb")
	private String password;
	
	@Column(name = "name", columnDefinition = "jsonb")
	//@Type(type = "jsonb")
	private String name;
	
	@Column(name = "role", columnDefinition = "jsonb")
	//@Type(type = "jsonb")
	@Enumerated(EnumType.STRING)
	private Role role;
	
	public User() {
	}
	
	public User(String username, String password, String name, Role role) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.role = role;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
