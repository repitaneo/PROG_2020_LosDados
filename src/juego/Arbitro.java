package juego;

public class Arbitro {

	public static final int DADO = 6;
	
	public static final int JUGADOR_1 = 100;
	public static final int JUGADOR_2 = 200;
	
	public static final int GANA_NADIE = 300;
	
	
	private boolean tiradas[][] = new boolean[2][DADO];
	
	
	
	
	/**
	 * 
	 * Registra la tirada de un jugador si es que merece la pena ser grabada
	 * 
	 * @param tirada la tirada a registrar
	 * @param jugador el jugador dueño de la tirada
	 */
	public void registrarTirada(Tirada tirada,int jugador) {
		
		if(tirada.getDado1()==tirada.getDado2()) {
			
			// los dados tienen el mismo número
			
			// guardo en la columna anterior al número que me dicen los dados
			int dondeGuardoLaTirada = tirada.getDado1()-1;
			
			// dependiendo del jugador guardo en una fila u otra
			if(jugador==JUGADOR_1) {
				
				tiradas[0][dondeGuardoLaTirada] = true;
			}
			else tiradas[1][dondeGuardoLaTirada] = true;
		}
	}
	
	
	
	
	/**
	 * Decide si, con las tiradas que hay, gana uno, otro o nadie
	 * 
	 * @return un int con el ganador
	 */
	public int quienGana() {
		
		// dependiende de quien tenga 6 aciertos...
		if(cuantosAciertos(JUGADOR_1) == 6) return JUGADOR_1;
		
		else if(cuantosAciertos(JUGADOR_2) == 6) return JUGADOR_2;
		
		// o ninguno
		else return GANA_NADIE;
	}




	
	
	/**
	 * 
	 * ¿Cuántos aciertos hay?
	 * 
	 * @param jugador
	 * @return
	 */
	private int cuantosAciertos(int jugador) {
		
		// detecto el jugador que me piden
		int queJugadorMirar;
		if(jugador==JUGADOR_1) {
			
			queJugadorMirar = 0;
		}
		else queJugadorMirar = 1;
		
		
		// cuento los aciertos apuntados
		int cuantosAciertos = 0;
		for(int i=0;i<DADO;i++) {
			
			if(tiradas[queJugadorMirar][i]) {
				
				cuantosAciertos++;
			}
		}
		
		return cuantosAciertos;

	}
	
}
