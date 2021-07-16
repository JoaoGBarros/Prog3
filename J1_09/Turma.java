

public class Turma {
	Alunos[] alunos;
	int num_alunos;
	double media;
	
	
	public Alunos[] getAlunos() {
		return alunos;
	}
	public void criaAlunos() {
		this.alunos = new Alunos[this.getNum_alunos()];
	}
	
	public void preencheAlunos(int i, String nome, double nota1, double nota2, double nota3) {
		this.alunos[i] = new Alunos();
		this.alunos[i].setNome(nome);
		this.alunos[i].setNota1(nota1);
		this.alunos[i].setNota2(nota2);
		this.alunos[i].setNota3(nota3);
		this.alunos[i].calculaMedia();
	}
	
	public void mediaTurma() {
		double soma = 0;
		for(int i = 0; i < this.alunos.length; i++) {
			soma += this.alunos[i].media;
		}
		this.setMedia(soma/this.alunos.length);
	}
	
	public void imprime() {
		System.out.println("Nome,Nota,Situacao,Media");
		for(int i = 0; i < this.alunos.length; i++) {
			System.out.printf("%s,%.1f,", this.alunos[i].getNome(), this.alunos[i].getMedia());
			
			if(this.alunos[i].getMedia() >= 7) {
				System.out.printf("Aprovado,");
			}else {
				System.out.printf("Prova Final,");
			}
			
			if(this.alunos[i].getMedia() > this.media) {
				System.out.printf("Acima\n");
			}else if (this.alunos[i].getMedia() == this.media) {
				System.out.printf("Na media\n");
			}else {
				System.out.printf("Abaixo\n");
			}
		}
	}
	
	public int getNum_alunos() {
		return num_alunos;
	}
	public void setNum_alunos(int num_alunos) {
		this.num_alunos = num_alunos;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	
	
	
}
