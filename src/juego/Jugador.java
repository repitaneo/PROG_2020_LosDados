package juego;

public class Jugador {

	
	/**
	 * 
	 * Genera una tirada y la devuelve
	 * 
	 * @return
	 */
	public Tirada generarTirada() {
		
		int dado1 = (int)(Math.random()*Arbitro.DADO)+1;
		int dado2 = (int)(Math.random()*Arbitro.DADO)+1;
		
		Tirada tirada = new Tirada();
		tirada.setDado1(dado1);
		tirada.setDado2(dado2);
		
		
		return tirada;		
	}
}
