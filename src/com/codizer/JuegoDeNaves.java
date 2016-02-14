
package com.codizer;

import java.util.Scanner;

/**
 * 
 * @author Adrian
 *
 */
public class JuegoDeNaves {
	
	/**
	 * Juego de naves que utiliza un Singletos para comunicar las clases
	 * 
	 * Se obtiene el singleton
	 * 
	 * Se eliminan las naves en base a los disparos
	 * Se incrementas las naves en un randon con base a las vidas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Naves n1 = Naves.instanciaNaves();
		
		Jugador j1 = new Jugador();
		Computadora c1 = new Computadora();
		
		Scanner leer =  new Scanner (System.in);

		System.out.println("==== JUEGO DE NAVES ====");
		
		int aDisparar;
		
		/**
		 * Mientras se tengan vidas
		 * se puede seguir jugando
		 */
		while (n1.getVidas() >= 0) {
	
			System.out.println("Tienes " + n1.getVidas() + ", Cuántos disparos?\n");
			aDisparar = leer.nextInt();
			
			if ( !(aDisparar > n1.getVidas())) {
				
				System.out.println("Naves actuales" + n1.getVidas() + "\n");
				
				for (int i = aDisparar; i> 0; i--) {
					j1.eliminarNave();
				}
				
				System.out.println("Naves destruidas " + aDisparar + "\n");
				
				int createNavaes = (int) Math.floor(Math.random() * n1.getVidas());
				
				for (int i = createNavaes; i> 0; i--) {
					c1.crearNave();
				}
				
			} else {
				System.out.println("No puedes disparar más de lo que tienes\n");
			}
			
		}
		
	}
}
