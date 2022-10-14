package com.mitocode.factoryAbstract;

public class ConexionSQLServer implements IConexionDB {

	@Override
	public void connect() {
		System.out.println("CONECTANDO A QLServer");
		
	}

	@Override
	public void desconect() {
		System.out.println("DESCONECTANDO DE QLServer");		
	}
}
