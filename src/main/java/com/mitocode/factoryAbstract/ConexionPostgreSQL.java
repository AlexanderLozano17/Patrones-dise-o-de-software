package com.mitocode.factoryAbstract;

public class ConexionPostgreSQL implements IConexionDB {
	
	@Override
	public void connect() {
		System.out.println("CONECTANDO A POSTGRESQL");
		
	}

	@Override
	public void desconect() {
		System.out.println("DESCONECTANDO DE POSTGRESQL");		
	}


}
