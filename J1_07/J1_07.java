import java.util.Scanner;
import java.util.Locale;

public class J1_07 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        leitura.useLocale(Locale.ENGLISH);
        Triangulo triangulo = new Triangulo();
        triangulo.x1 = leitura.nextDouble();
        triangulo.y1 = leitura.nextDouble();
        triangulo.x2 = leitura.nextDouble();
        triangulo.y2 = leitura.nextDouble();
        triangulo.x3 = leitura.nextDouble();
        triangulo.y3 = leitura.nextDouble();
        triangulo.CalculaPerimetro();
        System.out.printf("%.5f\n", triangulo.perimetro);

        leitura.close();
    }
}
