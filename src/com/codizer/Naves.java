package com.codizer;
/**
 * 
 * @author Adrian
 *
 */
public final class Naves {
	private static final Naves nave = new Naves();
	private int vidas;
	
	private Naves(){
		vidas = 10;
	}
	
	/**
	 * Getter que permite obtener la nave
	 * @return
	 */
	public static Naves instanciaNaves() {
		return nave;
	}

	/**
	 * Obtiene las vidas
	 * @return vidas de tipo int
	 */
	public int getVidas() {
		return vidas;
	}

	/**
	 * Set vidas 
	 * @param vidas de tipo int
	 */
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	/**
	 * Permite crear vidas
	 */
	public void crearVida() {
		vidas++;
	}
	
	/**
	 * Permite eliminar vidas
	 */
	public void eliminarVidas() {
		vidas--;
	}
	
}
