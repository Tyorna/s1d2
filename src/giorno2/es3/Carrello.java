package giorno2.es3;

public class Carrello {
		int clienteAssociato;
		double totale;
		String[] elencoArt = new String[3];
		
		//costruttore
		  public Carrello(int clienteAssociato, String[] elencoArt, double totale) {
				this.elencoArt = elencoArt;
				this.totale =  totale;
			}
		  
		//metodi
			void carrello() {
				System.out.println("Il cliente è: " + this.clienteAssociato + ",\n ha questi articoli " + this.elencoArt + "\n totale speso: " + this.totale);
			}
}
