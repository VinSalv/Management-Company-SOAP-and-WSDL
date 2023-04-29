/* 
* Course: Distributed Programming 2021/2022
* 
* Group:
* Salvati       Vincenzo    0622701550  v.salvati10@studenti.unisa.it
* Giuseppe    	Renzulli    0622701514  g.renzulli4@studenti.unisa.it
* 
*/

/**
    @file Employee.java
*/

// PURPOSE OF THE FILE: The script describes the Employee object. 

package com.exercise.ws;

import java.io.Serializable;

public class Employee implements Serializable {

	private int id;
	private String name;
	private String surname;
	private String email;
	private int telephone;
	private String department;
	private Agenda agenda = new Agenda();

	public Employee() {
		super();
	}

	public Employee(int id, String name, String surname, String email, int telephone, String department) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.telephone = telephone;
		this.department = department;
		this.agenda = new Agenda();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

}
