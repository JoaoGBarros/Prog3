import java.util.Scanner;
public class Departamento {
	String departamento;
	int num_funcionarios;
	Funcionario[] funcionarios;
	double soma_salarios = 0;
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = new String(departamento);
	}
	public int getNum_funcionarios() {
		return num_funcionarios;
	}
	public void setNum_funcionarios(int num_funcionarios) {
		this.num_funcionarios = num_funcionarios;
	}
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public void criaFuncionarios() {
		this.funcionarios =  new Funcionario[this.getNum_funcionarios()];
	}
	public void setFuncionarios(int j, Scanner leitura) {
        this.funcionarios[j] = new Funcionario();
		this.funcionarios[j].setNome(leitura.next());
		this.funcionarios[j].setSalario(leitura.nextDouble());
		this.funcionarios[j].setAdmissao(leitura.next());
	}
	
	public double getSoma_salarios() {
		return soma_salarios;
	}
	public void setSoma_salarios(double soma_salarios) {
		this.soma_salarios = soma_salarios;
	}
	
	public void realizarAumento(double aumento) {
		for(int i = 0; i < this.funcionarios.length; i++) {
			double salario = this.funcionarios[i].salario * (1+aumento);
			this.funcionarios[i].setSalario(salario);
		}
	}
	
	public void ImprimeFuncio(int j) {
		System.out.printf("Nome: %s\n Salario: %.2f\n Data: %s\n", this.funcionarios[j].getNome(),
				this.funcionarios[j].getSalario(), this.funcionarios[j].getAdmissao());
	}
	
	public Funcionario funcionarioTransferido() {
		Funcionario troca;
		troca = this.funcionarios[0];
		
		return troca;
	}
	
	public void realizaSoma() {
		double soma = 0;
		
		for(int j = 0; j < this.funcionarios.length; j++) {
			soma += this.funcionarios[j].getSalario();
		}
		
		this.setSoma_salarios(soma);
	}
	
}



