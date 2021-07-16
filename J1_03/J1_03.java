package J1_03;
import java.util.Scanner;
public class J1_03 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int x, y, resto;

        x = leitura.nextInt();
        y = leitura.nextInt();

        do{
            resto = x % y;
            x = y;
            y = resto;
        }while(resto != 0);

        System.out.println(x);
        leitura.close();
    }
}
