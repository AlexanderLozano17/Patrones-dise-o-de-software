package com.mitocode.factoryAbstract;

public class ConexionOracle implements IConexionDB{

	@Override
	public void connect() {
		System.out.println("CONECTANDO A ORACLE");
		
	}

	@Override
	public void desconect() {
		System.out.println("DESCONECTANDO DE ORACLE");		
	}

}
