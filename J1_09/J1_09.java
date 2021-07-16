
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
public class J1_09 {

	public static void main(String[] args) {
		Turma t1 = new Turma();
		Scanner leitura = new Scanner(System.in);
		t1.setNum_alunos(leitura.nextInt());
		t1.criaAlunos();
		Locale.setDefault(Locale.US);
        leitura.useLocale(Locale.ENGLISH);
		for(int i = 0; i < t1.alunos.length; i++) {
			t1.preencheAlunos(i, leitura.next(), leitura.nextDouble(), leitura.nextDouble(), leitura.nextDouble());
		}
		t1.mediaTurma();
		t1.imprime();
		leitura.close();
	}

}
