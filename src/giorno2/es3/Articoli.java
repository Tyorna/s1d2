package giorno2.es3;

public class Articoli {
	int codiceArticolo;
	String descrizioneA;
	double prezzo;
	int disponibilità;
	
	//costruttore
	  public Articoli(int codiceArticolo, String descrizioneA, double prezzo, int disponibilità) {
			this.codiceArticolo = codiceArticolo;
			this.descrizioneA = descrizioneA;
			this.prezzo =  prezzo;
			this.disponibilità = disponibilità;
		}
	  
	//metodi
		void vetrina() {
			System.out.println("L'articolo è: " + this.descrizioneA + ",\n costa: " + this.prezzo + "\n disponibilità pezzi: " + this.disponibilità + "\n il codice articolo è: " + this.codiceArticolo);
		}
}
