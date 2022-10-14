package com.mitocode.factoryAbstract;

public class FabricaConexiondb implements IFabricaAbstracta{

	@Override
	public IConexionDB getDB(String motorDB) {
		// TODO Auto-generated method stub
		if (motorDB == null) {
			return new ConexionEmpty();
		}
		
		if (motorDB.equals("MYSQL")) {
			return new ConexionMysql();
		}
		
		if (motorDB.equals("ORACLE")) {
			return new ConexionOracle();
		}
		
		if (motorDB.equals("POSTGRE")) {
			return new ConexionPostgreSQL();
		}
		
		if (motorDB.equals("SQL")) {
			return new ConexionSQLServer();
		}
		return new ConexionEmpty();
	}

	@Override
	public IConexionRest getRest(String area) {
		return null;
		
	}

}
