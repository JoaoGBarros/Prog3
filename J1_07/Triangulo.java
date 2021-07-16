import java.lang.Math;
public class Triangulo {
	Ponto p1 = new Ponto();
	Ponto p2 = new Ponto();
	Ponto p3 = new Ponto();
	double perimetro = 0;
	
	public Ponto getP1() {
		return p1;
	}
	public void setP1(double x, double y) {
		this.p1.setX(x);
		this.p1.setY(y);
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public Ponto getP2() {
		return p2;
	}
	public void setP2(double x, double y) {
		this.p2.setX(x);
		this.p2.setY(y);
	}
	public Ponto getP3() {
		return p3;
	}
	public void setP3(double x, double y) {
		this.p3.setX(x);
		this.p3.setY(y);
	}
	
	public double CalculaDistancia(Ponto a, Ponto b) {
		double distX = Math.abs(a.x - b.x); 
		double distY = Math.abs(a.y - b.y);
		double distTotal = Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
		return distTotal;
	}
	
	public void CalculaPerimetro() {
		setPerimetro(CalculaDistancia(p1, p2) + CalculaDistancia(p1, p3) + CalculaDistancia(p2, p3));
	}
}
