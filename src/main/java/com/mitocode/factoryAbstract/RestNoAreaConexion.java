package com.mitocode.factoryAbstract;

public class RestNoAreaConexion implements IConexionRest {

	@Override
	public void leerUrl(String url) {
		System.out.println("SIN CONEXIONA REST");
	}

}
