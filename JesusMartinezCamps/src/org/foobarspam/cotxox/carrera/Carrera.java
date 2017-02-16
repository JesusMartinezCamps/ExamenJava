package org.foobarspam.cotxox.carrera;
import org.foobarspam.cotxox.tarifa.*;

public class Carrera {

	/*Atributos*/
	private String origen = null;
	private String destino = null;
	private double distancia = 7.75;
	private int tiempoEsperadoMinutos = 10;
	private String tarjetaCredito = null;
	
	/*Constructor*/
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
	}
	public Carrera(double distancia){
		this.distancia = distancia;
	}
	/*getters setters*/
	
	public void setOrigen(String origen){
		this.origen = origen;
	}
	public String getOrigen(){
		return this.origen;
	}
	public void setDestino(String destino){
		this.destino = destino;
	}
	public String getDestino(){
		return this.destino;
	}
	public void setDistancia(double distancia){
		this.distancia = distancia;
	}
	public double getDistancia(){
		return this.distancia;
	}
	public void setTiempoEsperado(int tiempoEsperadoMinutos){
		this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;
	}
	public int getTiempoEsperado(){
		return this.tiempoEsperadoMinutos;
	}
	public String getTarjetaCredito(){
		return this.tarjetaCredito;
	}

	public double getCosteEsperado(){
		Tarifa tarifa = new Tarifa(getDistancia());
		tarifa.calcularCoste(getDistancia());
		return tarifa.getCosteTotalEsperado();
	}
	
}

