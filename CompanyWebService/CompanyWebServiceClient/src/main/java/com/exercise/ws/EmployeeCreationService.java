/**
 * EmployeeCreationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.exercise.ws;

public interface EmployeeCreationService extends java.rmi.Remote {
    public com.exercise.ws.Employee creationEmployee(int id, java.lang.String name, java.lang.String surname, java.lang.String email, int telephone, java.lang.String department) throws java.rmi.RemoteException;
    public java.lang.String updateAgenda(int id, java.lang.String stringDate, java.lang.String text) throws java.rmi.RemoteException;
    public java.lang.String viewEmployees() throws java.rmi.RemoteException;
    public java.lang.String setAgenda(int id, java.lang.String stringDate, java.lang.String text) throws java.rmi.RemoteException;
    public java.lang.String searchEmployees(java.lang.String name, java.lang.String surname, java.lang.String email, java.lang.String department) throws java.rmi.RemoteException;
    public java.lang.String deleteAgenda(int id, java.lang.String stringDate) throws java.rmi.RemoteException;
    public java.lang.String viewAgenda(int id) throws java.rmi.RemoteException;
    public java.lang.String viewAgendaByDate(int id, java.lang.String stringDate) throws java.rmi.RemoteException;
}
