package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import org.foobarspam.cotxox.conductores.*;

public class PoolConductores {

	private ArrayList<Conductor> poolConductores = new ArrayList<Conductor>(3);
	
	/*Constructor*/
	public PoolConductores(ArrayList poolConductores){
		this.poolConductores = poolConductores;
	}


	public ArrayList<Conductor> getArray(){
		return this.poolConductores;
	}
	
	public void asignarConductor(){
		for(int i = 0 ; i < poolConductores.size() ; i++){
			Conductor conductor = poolConductores.get(i);
			if(conductor != null){
				conductor.setEstado(true);
			}
		}
	}
}