package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

	/*Atributos*/
	private String nombre = null;
	private String modelo = null;
	private String matricula = null;
	private int valoracionMedia = 0;
	private ArrayList<Integer> valoraciones = new ArrayList<>();

	
	
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
	public void setValoracion(int valoracion){
		for(int i = 0; i < 4; i++){
			valoraciones.add(4);
		}
		int total = 0;
		for(int valor:valoraciones){
			total += valor;
		}
		valoracionMedia = total / valoraciones.size();
	}
}
