package com.codizer;

/**
 * 
 * @author Adrian
 *
 */
public class Computadora {
	Naves n1 = Naves.instanciaNaves();
	
	/**
	 * Contructor por defecto
	 * para la clase Computadora
	 */
	public Computadora(){}
	
	/**
	 * Permite crear una nave 
	 * en el singleton
	 */
	public void crearNave(){
		n1.crearVida();
	}
}
