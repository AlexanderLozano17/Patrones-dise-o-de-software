package com.mitocode.factory;

public class MainFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fabrica fabrica = new Fabrica();
		
		ITransporte agua = fabrica.getTransporte("AGUA");
		agua.creaAccion();
		

		ITransporte tierra = fabrica.getTransporte("TIERRA");
		tierra.creaAccion();
		

		ITransporte aire = fabrica.getTransporte("AIRE");
		aire.creaAccion();
		
		ITransporte sinTrans = fabrica.getTransporte("LINEA");
		sinTrans.creaAccion();
		
	}
}
