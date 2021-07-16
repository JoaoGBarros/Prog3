import java.util.Scanner;
public class Empresa {
	String empresa;
	String CNPJ;
	int num_departamentos;
	Departamento[] departamentos;
	
	public String getEmpresa() {
		return this.empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = new String(empresa);
	}
	public String getCNPJ() {
		return this.CNPJ;
	}
	public void setCNPJ(String CNPJ) {
		this.CNPJ = new String(CNPJ);
	}
	public int getNum_departamentos() {
		return this.num_departamentos;
	}
	public void setNum_departamentos(int num_departamentos) {
		this.num_departamentos = num_departamentos;
	}
	
	public void criaDepartamentos(int num) {
		this.departamentos = new Departamento[num];
	}
	
	
	public void setDepartamentos(int i, String departamento, int num_funcionarios, Scanner leitura) {
		this.departamentos[i] = new Departamento();
		this.departamentos[i].setDepartamento(departamento);;
		this.departamentos[i].setNum_funcionarios(num_funcionarios);
		this.departamentos[i].criaFuncionarios();
		for(int j = 0; j < this.departamentos[i].funcionarios.length; j++) {
			this.departamentos[i].setFuncionarios(j, leitura);
		}
	}
	
	public void darAumento() {
		this.departamentos[0].realizarAumento(0.1);
	}
	
	public void imprimeFuncionario(int i) {
		System.out.println("Departamento " + this.departamentos[i].departamento);
		for(int j = 0; j < this.departamentos[i].getNum_funcionarios(); j++) {
			this.departamentos[i].ImprimeFuncio(j);
		}
	}
	
	
	public void transfereFuncionario(int num) {
		Funcionario t;
		t = this.departamentos[0].funcionarioTransferido();
		this.departamentos[0].setNum_funcionarios(this.departamentos[0].getNum_funcionarios() - 1);
		this.departamentos[1].setNum_funcionarios(this.departamentos[1].getNum_funcionarios() + 1);
		Funcionario[] d0 = new Funcionario[this.departamentos[0].num_funcionarios];
		Funcionario[] d1 = new Funcionario[this.departamentos[1].num_funcionarios];
		//System.arraycopy(local inicial, posicao inicial, destino, posicao inicial, ate onde);
		System.arraycopy(this.departamentos[0].funcionarios, 1, d0, 0, d0.length);
		System.arraycopy(this.departamentos[1].funcionarios, 0, d1, 1, this.departamentos[1].funcionarios.length);
		this.departamentos[0].funcionarios = d0;
		this.departamentos[1].funcionarios = d1;	
		this.departamentos[1].funcionarios[0] = t;
	}
	
	public void salarioDepartamentos() {
		for(int i = 0; i < this.departamentos.length; i++) {
			this.departamentos[i].realizaSoma();
			System.out.printf("%s R$ %.2f\n", this.departamentos[i].getDepartamento(), this.departamentos[i].getSoma_salarios());
		}
	}
	
	

}
