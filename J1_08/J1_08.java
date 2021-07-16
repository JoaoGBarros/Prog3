import java.util.Scanner;
import java.util.Locale;
public class J1_08 {

	public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
		Scanner leitura = new Scanner(System.in);
		leitura.useLocale(Locale.US);
        Empresa emp = new Empresa();
        emp.setEmpresa(leitura.next());
        emp.setCNPJ(leitura.next());
        emp.setNum_departamentos(leitura.nextInt());
        emp.criaDepartamentos(emp.getNum_departamentos());
        for(int i = 0; i < emp.departamentos.length; i++) {
        	emp.setDepartamentos(i, leitura.next(), leitura.nextInt(), leitura);
        }
        emp.darAumento();
        emp.transfereFuncionario(0);
        
        /*for(int i = 0; i < emp.departamentos.length; i++) {
        	emp.imprimeFuncionario(i);
        }*/
        
        emp.salarioDepartamentos();
        leitura.close();
	}

}
