package com.mitocode.factoryAbstract;

public class ConexionEmpty implements IConexionDB{

	public void connect() {
		System.out.println("CONECTAR: NO HAY MOTOR DE BASE DE DATOS");
		
	}

	public void desconect() {
		System.out.println("DESCONECTAR: NO HAY MOTOR DE BASE DE DATOS");
		
	}

}
