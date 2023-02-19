package test;
public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca; 
	public Motor motor;
	public int registro;
	public int cantidadCreados;
	
	public int cantidadAsientos() {
		int cantidad = 0;
	    for (Asiento asiento : asientos) {
	    	if (asiento != null) {
	    		cantidad++;
	    	}
	    }
	    return cantidad;
	}
	    
	public String verificarIntegridad() {
		if (motor.registro != registro) {
			return "Las piezas no son originales";
		}
		for (Asiento asiento : asientos) {
			if (asiento != null && asiento.registro != registro) {
				return "Las piezas no son originales";
			}
		}
		return "Auto original";
	}
} 
