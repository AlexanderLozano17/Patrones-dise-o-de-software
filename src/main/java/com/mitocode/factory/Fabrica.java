package com.mitocode.factory;

public class Fabrica {

	public ITransporte getTransporte(String tipoTransporte) {
	
		if (tipoTransporte.equals("TIERRA")) {
			return new TransporteTierra();
		}
		
		if (tipoTransporte.equals("AGUA")) {
			return new TransporteAgua();	
		}
		
		if (tipoTransporte.equals("AIRE")) {
			return new TransporteAire();
		}
		
		return new SinTransporte();
	}
}
