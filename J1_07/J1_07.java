import java.util.Scanner;
import java.util.Locale;

public class J1_07 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Locale.setDefault(Locale.US);
        leitura.useLocale(Locale.ENGLISH);
        Triangulo triangulo = new Triangulo();
        
        triangulo.setP1(leitura.nextDouble(), leitura.nextDouble());
        triangulo.setP2(leitura.nextDouble(), leitura.nextDouble());
        triangulo.setP3(leitura.nextDouble(), leitura.nextDouble());
        
        triangulo.CalculaPerimetro();
        
        System.out.printf("%.5f\n", triangulo.getPerimetro());
        
        leitura.close();
	}

}
