/* 
* Course: Distributed Programming 2021/2022
* 
* Group:
* Salvati       Vincenzo    0622701550  v.salvati10@studenti.unisa.it
* Giuseppe    	Renzulli    0622701514  g.renzulli4@studenti.unisa.it
* 
*/

/**
    @file EmployeeCreationService.java
*/

// PURPOSE OF THE FILE: The script generates services from clients. 

package com.exercise.ws;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

public class EmployeeCreationService {

	// Store employee into a file
	private static void writeEmployeeFile(List listEmp) {
		try {
			ObjectOutputStream fbinarioOut = new ObjectOutputStream(
					new FileOutputStream("C:/Users/vince/EclipseProject/CompanyWebService/employee.dat"));
			fbinarioOut.writeObject(listEmp);
			fbinarioOut.flush();
			fbinarioOut.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// Fetch employees from a file
	private static List<Employee> readEmployeeFile() {
		try {
			ObjectInputStream fin = new ObjectInputStream(
					new FileInputStream("C:/Users/vince/EclipseProject/CompanyWebService/employee.dat"));
			List<Employee> listEmp = (List<Employee>) fin.readObject();
			fin.close();
			return listEmp;
		} catch (FileNotFoundException e) {
			return new LinkedList<>();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// Service that create an employee
	public Employee creationEmployee(int id, String name, String surname, String email, int telephone,
			String department) {
		// Generate an object Employee
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSurname(surname);
		emp.setEmail(email);
		emp.setTelephone(telephone);
		emp.setDepartment(department);
		// Read the list of employees from file
		List<Employee> listEmp = readEmployeeFile();
		// Add the new employee into a list
		listEmp.add(emp);
		// Update the file of employees with a new list
		writeEmployeeFile(listEmp);

		return emp;
	}

	// Show a list of all employees
	public String viewEmployees() {
		// Read the list of employees from file
		List<Employee> listEmp = readEmployeeFile();
		// Provide a string of the list of employees
		StringBuilder employees = new StringBuilder();
		employees.append("");
		int i = 1;
		for (Employee emp : listEmp) {
			employees.append(" Employee: ").append(i);
			employees.append(" Id: ").append(emp.getId());
			employees.append(" Name: ").append(emp.getName());
			employees.append(" Surname: ").append(emp.getSurname());
			employees.append(" Email: ").append(emp.getEmail());
			employees.append(" Telephone: ").append(emp.getTelephone());
			employees.append(" Department: ").append(emp.getDepartment());
			i++;
		}
		return employees.toString();
	}

	// Search employees
	public String searchEmployees(String name, String surname, String email, String department) {
		// Read the list of employees from file
		List<Employee> listEmp = readEmployeeFile();
		// Provide a string of the filtered list of employees
		StringBuilder employees = new StringBuilder();
		employees.append("");
		int i = 1;
		boolean found = true;
		for (Employee emp : listEmp) {
			if (name != null)
				if (!(name.equalsIgnoreCase(emp.getName())))
					found = false;
			if (surname != null)
				if (!(surname.equalsIgnoreCase(emp.getSurname())))
					found = false;
			if (email != null)
				if (!(email.equalsIgnoreCase(emp.getEmail())))
					found = false;
			if (department != null)
				if (!(department.equalsIgnoreCase(emp.getDepartment())))
					found = false;
			if (found) {
				employees.append(" Employee: ").append(i);
				employees.append(" Id: ").append(emp.getId());
				employees.append(" Name: ").append(emp.getName());
				employees.append(" Surname: ").append(emp.getSurname());
				employees.append(" Email: ").append(emp.getEmail());
				employees.append(" Telephone: ").append(emp.getTelephone());
				employees.append(" Department: ").append(emp.getDepartment());
				i++;
			}
			found = true;
		}
		return employees.toString();
	}

	// Set the agenda of the specific employee
	public String setAgenda(int id, String stringDate, String text) {
		// Read the list of employees from file
		List<Employee> listEmp = readEmployeeFile();
		// Check the employee's id
		Employee empFound = null;
		for (Employee emp : listEmp) {
			if (id == emp.getId()) {
				empFound = emp;
				break;
			}
		}
		// Check the date
		Date date;
		try {
			DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
			dateFormat.setLenient(false);
			date = dateFormat.parse(stringDate);
		} catch (ParseException e) {
			return "Date format invalid... you must use [gg/mm/yyyy]";
		}
		// Set the note if the set date does not exist
		if (empFound != null) {
			HashMap<Date, String> agenda = (HashMap<Date, String>) empFound.getAgenda().getMapProperty();
			if (!agenda.containsKey(date)) {
				listEmp.remove(empFound);
				agenda.put(date, text);
				listEmp.add(empFound);
				writeEmployeeFile(listEmp);
				return "Notes has been added";
			} else
				return "Data altready existent";
		}
		return "Id does not exist";
	}

	// Update the agenda of the specific employee
	public String updateAgenda(int id, String stringDate, String text) {
		// Read the list of employees from file
		List<Employee> listEmp = readEmployeeFile();
		// Check the employee's id
		Employee empFound = null;
		for (Employee emp : listEmp) {
			if (id == emp.getId()) {
				empFound = emp;
				break;
			}
		}
		// Check the date
		Date date;
		try {
			DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
			dateFormat.setLenient(false);
			date = dateFormat.parse(stringDate);
		} catch (ParseException e) {
			return "Date format invalid... you must use [gg/mm/yyyy]";
		}
		// Update the note if the set date exist
		if (empFound != null) {
			HashMap<Date, String> agenda = (HashMap<Date, String>) empFound.getAgenda().getMapProperty();
			if (agenda.containsKey(date)) {
				listEmp.remove(empFound);
				agenda.remove(date);
				agenda.put(date, text);
				listEmp.add(empFound);
				writeEmployeeFile(listEmp);
				return "Note has been updated";
			} else
				return "Data doesn't exist";
		}
		return "Id does not exist";
	}

	// Delete the agenda of the specific employee
	public String deleteAgenda(int id, String stringDate) {
		// Read the list of employees from file
		List<Employee> listEmp = readEmployeeFile();
		// Check the employee's id
		Employee empFound = null;
		for (Employee emp : listEmp) {
			if (id == emp.getId()) {
				empFound = emp;
				break;
			}
		}
		// Check the date
		Date date;
		try {
			DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
			dateFormat.setLenient(false);
			date = dateFormat.parse(stringDate);
		} catch (ParseException e) {
			return "Date format invalid... you must use [gg/mm/yyyy]";
		}
		// Delete the note if the set date exist
		if (empFound != null) {
			HashMap<Date, String> agenda = (HashMap<Date, String>) empFound.getAgenda().getMapProperty();
			if (agenda.containsKey(date)) {
				listEmp.remove(empFound);
				agenda.remove(date);
				listEmp.add(empFound);
				writeEmployeeFile(listEmp);
				return "Note has been deleted";
			} else
				return "Data doesn't exist";
		}
		return "Id does not exist";
	}

	// Show the agenda of the specific employee
	public String viewAgenda(int id) {
		// Read the list of employees from file
		List<Employee> listEmp = readEmployeeFile();
		// Check the employee's id
		Employee empFound = null;
		for (Employee emp : listEmp) {
			if (id == emp.getId()) {
				empFound = emp;
				break;
			}
		}
		// Provide a list of employee's notes
		if (empFound != null) {
			HashMap<Date, String> agenda = (HashMap<Date, String>) empFound.getAgenda().getMapProperty();
			StringBuilder notes = new StringBuilder();
			notes.append("");
			for (Date key : agenda.keySet())
				notes.append(key).append(" ").append(agenda.get(key));
			return notes.toString();
		}
		return "Id does not exist";
	}

	// Show the agenda of the specific employee and the specific date
	public String viewAgendaByDate(int id, String stringDate) {
		// Read the list of employees from file
		List<Employee> listEmp = readEmployeeFile();
		// Check the employee's id
		Employee empFound = null;
		for (Employee emp : listEmp) {
			if (id == emp.getId()) {
				empFound = emp;
				break;
			}
		}
		// Check the date
		Date date;
		try {
			DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
			dateFormat.setLenient(false);
			date = dateFormat.parse(stringDate);
		} catch (ParseException e) {
			return "Date format invalid... you must use [gg/mm/yyyy]";
		}
		if (empFound != null) {
			HashMap<Date, String> agenda = (HashMap<Date, String>) empFound.getAgenda().getMapProperty();
			return agenda.getOrDefault(date, "Data doesn't exist");
		}
		return "Id does not exist";
	}

}
