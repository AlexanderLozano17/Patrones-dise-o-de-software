package com.mitocode.singleton;

public class MainSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// No permite realizar la instancia de Conexion ya que el constructor es privado
		//Conexion conexion = new Conexion();
		
		// Se accede a la instancia através del metodo static getInstancia()
		Conexion conexion = Conexion.getInstancia();
		conexion.conectar();
		conexion.desconectar();
		
		boolean rpta = conexion instanceof Conexion;
		System.out.println(rpta);
	}

}
