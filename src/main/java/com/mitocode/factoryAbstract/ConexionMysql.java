package com.mitocode.factoryAbstract;

public class ConexionMysql implements IConexionDB {

	@Override
	public void connect() {
		System.out.println("CONECTANDO A MYSQL");
		
	}

	@Override
	public void desconect() {
		System.out.println("DESCONECTANDO DE MYSQL");		
	}

}
