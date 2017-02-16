package org.foobarspam.cotxox.tarifa;
import org.foobarspam.cotxox.carrera.*;

public class Tarifa extends Carrera {

	/*atributos*/
	private double costeMilla = 1.35;
	private double costeMinuto = 0.35;
	private double costeMinimo = 5;
	private double porcentajeComision = 20;
	private double total = 0;
	
	public Tarifa(double distancia){
		super(distancia);
	}
	
	public double getCosteMinino(){
		return this.costeMinimo;
	}

	public double getCosteTotalEsperado(){
		return total;
	}
	
	public double calcularCoste(double distancia){
		total = costeMilla * distancia;
		if(total < 5.0){
			return 5;
		}else{
			return total;
		}
	}
}
