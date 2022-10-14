package com.mitocode.factoryAbstract;

public interface IFabricaAbstracta {

	public IConexionDB getDB(String motorDB);
	public IConexionRest getRest(String area);
}
