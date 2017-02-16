package org.foobarspam.cotxox.carrera;
import org.foobarspam.cotxox.conductores.*;
import org.foobarspam.cotxox.tarifa.*;

public class Carrera {

	/*Atributos*/
	private String origen = null;
	private String destino = null;
	private double distancia = 7.75;
	private int tiempoEsperadoMinutos = 10;
	private String tarjetaCredito = null;
	private double costeTotal = 0;
	private double propina = 0 ;
	
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

	public double getCosteTotal(){
		return this.costeTotal;
	}
	public void setCosteTotal(double pago){
		this.costeTotal = costeTotal + pago;
	}
	public void setPropina(double propina){
		this.propina = propina;
	}
	/*interfaz publica*/
	public double getCosteEsperado(){
		Tarifa tarifa = new Tarifa(getDistancia());
		tarifa.calcularCoste(getDistancia());
		
		return tarifa.getCosteTotalEsperado();
	}
	
	public void asignarConductor(PoolConductores conductores){
		//int total = conductores;
		//for(int i = 0 ; i < total ;i++){
			
		//}
	}
	public void liberarConductor(PoolConductores conductores){
		
	}
	public void realizarPago(double pago){
		setCosteTotal(pago);
	}
	public void recibirPropina(double propina){
		setPropina(propina);
	}
}

