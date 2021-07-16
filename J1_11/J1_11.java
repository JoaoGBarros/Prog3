package J1_11;
import java.util.Scanner;
import java.util.Locale;

public class J1_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
        scanner.useLocale(Locale.ENGLISH);
		int num = scanner.nextInt();
		scanner.nextLine();
		CarrinhoDeCompras c = new CarrinhoDeCompras(num);
		for (int i = 0; i < num; i++) {
			String nome = scanner.nextLine();
			double preco = scanner.nextDouble();
			scanner.nextLine();
			int qtd = scanner.nextInt();
			scanner.nextLine();
			c.adicionar(nome, preco, qtd, i);
		}
		c.imprimir();
		scanner.close();
	}

}
