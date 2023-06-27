package giorno2.es3;

public class terzo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Articoli art1 = new Articoli(123, "maglietta", 30.5, 10);
	      art1.vetrina();
	      System.out.println();
	      Cliente cliente1 = new Cliente (9321, "Ty M.", "ty@gmail.come", "28/05/2010");
	      cliente1.cliente();
	      System.out.println();
	      Carrello car1 = new Carrello(9321, ["maglietta", "scarpa", "jeans"], 100);
	      car1.carrello();
	}

}
