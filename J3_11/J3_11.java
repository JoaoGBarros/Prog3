import java.util.Scanner;
import java.text.Collator;
import java.util.Locale;
public class J3_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(new Locale("pt", "BR"));
		Pessoa[] pessoas = new Pessoa[100];
		int i = 0;
		int contador = 0;
		String[] s = new String[3];
		String frase;
		
		while(true) {
			frase = scan.nextLine();
			
			if(frase.equals(".")) {
				break;
			}
			pessoas[contador] = new Pessoa();
			s = frase.split(";");
			pessoas[contador].setNome(s[0]);
			pessoas[contador].setIdade(Integer.parseInt(s[1]));
			pessoas[contador].setAltura(Double.parseDouble(s[2].replace(",",".")));
			contador++;
		}
		scan.close();
		
		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		Pessoa aux = new Pessoa();
		for(i = 0; i < contador; i++) {
			for(int j = i+1; j < contador; j++) {
				if(collator.compare(pessoas[i].getNome(), pessoas[j].getNome()) >= 0) {
					aux = pessoas[i];
					pessoas[i] = pessoas[j];
					pessoas[j] = aux;
				}
				
			}
		}
		
		for(i = 0; i < contador; i++) {
			pessoas[i].imprime();
		}
		
		for(i = 0; i < contador; i++) {
			for(int j = i+1; j < contador; j++) {
				if(pessoas[i].getIdade() <= pessoas[j].getIdade()) {
					aux = pessoas[i];
					pessoas[i] = pessoas[j];
					pessoas[j] = aux;
				}
				
			}
		}
		
		System.out.printf("\n");
		
		for(i = 0; i < contador; i++) {
			pessoas[i].imprime();
		}


		for(i = 0; i < contador; i++) {
			for(int j = i+1; j < contador; j++) {
				if(pessoas[i].getAltura() >= pessoas[j].getAltura()) {
					aux = pessoas[i];
					pessoas[i] = pessoas[j];
					pessoas[j] = aux;
				}
				
			}
		}

		System.out.printf("\n");
		
		for(i = 0; i < contador; i++) {
			pessoas[i].imprime();
		}

	}
}


