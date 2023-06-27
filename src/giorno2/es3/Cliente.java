package giorno2.es3;


public class Cliente {
	int codiceCliente;
	String NomeC;
	String email;
	String dataIscrizione;
	
	//costruttore
	  public Cliente(int codiceCliente, String NomeC, String email, String dataIscrizione) {
			this.codiceCliente = codiceCliente;
			this.NomeC = NomeC;
			this.email =  email;
			this.dataIscrizione = dataIscrizione;
		}
	  
	//metodi
		void cliente() {
			System.out.println("Il cliente è: " + this.codiceCliente + ",\n il suo nome è: " + this.NomeC + "\n la sua email è: " + this.email + "\n si è iscritto il: " + this.dataIscrizione);
		}
}
