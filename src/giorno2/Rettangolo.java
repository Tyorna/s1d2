package giorno2;

public class Rettangolo {
	
	double base;
	double altezza;
//costruttore
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	//metodi
	void area() {
		double totaleA = this.base * this.altezza;
		System.out.println("L'area del rettangolo è :" + totaleA);
	}
	
	void perimetro() {
		double totaleP = 2* (this.base + this.altezza);
		System.out.println("Il perimetro del rettangolo è :" + totaleP);
	}
}
