package com.mitocode.factoryAbstract;

public class FabricaProductor {
	
	public static IFabricaAbstracta getFactory(String tipoFabrica) {
		
		if (tipoFabrica.equals("DB")) {
			return new FabricaConexiondb();
		}
		
		if (tipoFabrica.equals("REST")) {
			return new FabricaConexionRest();
		}
		return null;
	}
}
