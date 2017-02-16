package org.foobarspam.cotxox.conductores;

public class Conductor {

	/*Atributos*/
	private String nombre = null;
	private String modelo = null;
	private String matricula = null;
	private int valoracionMedia = 0;
	
	
	/*Constructor*/
	public Conductor(String nombre){
		this.nombre = nombre;
	}
	
	/*getters y setters*/
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
}
