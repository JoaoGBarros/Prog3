

public class Pessoa {
	int idade;
	double altura;
	String nome;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprime() {
		System.out.printf("%s (%d anos, %.2f metros)\n", this.getNome(), this.getIdade(), this.getAltura());
	}
	
	
}
