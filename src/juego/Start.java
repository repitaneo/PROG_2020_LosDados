package juego;

public class Start {

	public static void main(String[] args) {


		Jugador paco = new Jugador();
		Jugador ana = new Jugador();
		
		Arbitro juez = new Arbitro();
		
		int tiradas = 0;
		while(juez.quienGana()==Arbitro.GANA_NADIE) {
			
			Tirada tiro = ana.generarTirada();
			juez.registrarTirada(tiro, Arbitro.JUGADOR_1);
			
			tiro = paco.generarTirada();
			juez.registrarTirada(tiro, Arbitro.JUGADOR_2);
			
			tiradas++;
		}
		
		
		
		
		
		
		
		
		if(juez.quienGana()==Arbitro.JUGADOR_1) {
			
			System.out.println("ha ganado Ana");
		}
		else {
			
			System.out.println("ha ganado Paco");
		}
		System.out.println("Tiradas: "+tiradas);

	}

}
