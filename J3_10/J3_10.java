import java.util.Scanner;

public class J3_10 {

	public static void main(String[] args) {
		int i = 0, j = 0;
		Palavra[] p = new Palavra[20];
		
		String[] palavra1 = new String[2];
		String palavra, frase;
		Scanner scan = new Scanner(System.in);
		boolean achou = false;
		while(true){
			frase = scan.nextLine();
			if(frase.equals(".")) {
				break;
			}
			p[i] = new Palavra();
			palavra1 = frase.split(" = ");
			
			p[i].setPalavra(palavra1[0]);
			p[i].setTraducao(palavra1[1]);
			i++;
		}
		
		while(true) {
			palavra = scan.nextLine();
			
			if(palavra.equals(".")) {
				break;
			}
			
			for(j = 0; j < i; j++) {
				if(palavra.equals(p[j].getPalavra())) {
					achou = true;
					break;
				}else {
					achou = false;
				}
			}
			
			if(achou) {
				System.out.println(p[j].getTraducao());
			}else {
				System.out.printf("Termo nao encontrado: %s\n", palavra);
			}
		}
		scan.close();
	}

}
