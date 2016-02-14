package com.codizer;

/**
 * 
 * @author Adrian
 * 
 * Se encarga de eliminar naves
 *
 */
public class Jugador {
	
	Naves n1 = Naves.instanciaNaves();
	
	/**
	 * Contructor por defento para la 
	 * clase Jugador
	 */
	public Jugador(){}
	
	/**
	 * Método void que elimina una
	 * nave por medio de las vidas
	 */
	public void eliminarNave() {
		n1.eliminarVidas();
	}
}
