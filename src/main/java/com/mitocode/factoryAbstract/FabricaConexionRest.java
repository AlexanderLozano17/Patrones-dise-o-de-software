package com.mitocode.factoryAbstract;

public class FabricaConexionRest implements IFabricaAbstracta {

	@Override
	public IConexionRest getRest(String area) {
		
		if (area == null) {
			return new RestNoAreaConexion();
		}
		
		if (area.equals("COMPRAS")) {
			return new RestComprasConexion();
		}
		
		if (area.equals("VENTAS")) {
			return new RestVentasConexion();
		}
		
		return new RestNoAreaConexion();
	}
	
	@Override
	public IConexionDB getDB(String motorDB) {
		return null;
	}

}
