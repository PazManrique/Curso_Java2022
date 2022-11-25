/**
 * 
 */
package com.capgemini.exercise9;

import java.util.Date;

/**
 * @author mamanriq
 *
 */
public class Employee {
	private Date fechaIngreso;
	private double salario;
	private String nombre;
	private int edad;


	/**
	 * 
	 */
	public Employee() {
		nombre = "";
		fechaIngreso = new Date();
	}

	public Employee(Date fechaIngreso,double salario, String nombre, int edad ) {
		setFechaIngreso(fechaIngreso);
		this.salario = salario;
		setNombre(nombre);
		this.edad = edad;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		if(fechaIngreso == null)
			fechaIngreso = new Date();
		else
		this.fechaIngreso = fechaIngreso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre == null)
			nombre = "";
		else
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Employee employee = (Employee) obj;

		return (employee.nombre == this.nombre && employee.salario == this.salario && employee.edad == this.edad
				&& employee.fechaIngreso.equals(fechaIngreso) );
	}
	      
	    @Override
	    public int hashCode()
	    {
	     return 
	    	 7 * nombre.hashCode() +
	    	 11 * new Double(salario).hashCode()+
	    	 13 * fechaIngreso.hashCode() +
	    	 31 * new Integer(edad).hashCode();
	     
	    }
	      

	@Override
	public String toString() {//cambiar por stringbuilder
		
		return "Employee [fechaIngreso=" + fechaIngreso + ", salario=" + salario + "nombre=" + nombre + ", edad=" + edad + "]";

	}

}
