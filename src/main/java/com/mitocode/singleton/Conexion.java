package com.mitocode.singleton;

/**
 * 
 * @author jlozano
 *
 *Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, 
 *a la vez que proporciona un punto de acceso global a dicha instancia.
 *
 * La clase Base de datos define el método `obtenerInstancia  que permite a los clientes acceder a la misma instancia de
 * una conexión de la base de datos a través del programa.
 */
public class Conexion {
	 
	// El campo para almacenar la instancia singleton debe
    // declararse estático.
    private static Conexion instancia;
	
    // El constructor del singleton siempre debe ser privado
    // para evitar llamadas de construcción directas con el
    // operador `new`.
	private Conexion() {
		
	}

    // El método estático que controla el acceso a la instancia
    // singleton.
	public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}
	
	public void conectar() {
		System.out.println("Me conecté a la BD");
	}
	
	public void desconectar() {
		System.out.println("Me desconecté a la BD");
	}
}
