package J1_10;
import java.util.Scanner;
public class J1_10 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int n;
        int fibo1 = 0, fibo2 = 1, fibo;

        n = leitura.nextInt();

        if(n >= 0 & n <= 47){
            for(int contador = 0; contador < n; contador++){
                
                if(contador == 0){
                    System.out.print(fibo1 + " ");
                }else if(contador == 1){
                    System.out.print(fibo2 + " ");
                }else{
                    fibo = fibo1 + fibo2;
                    fibo1 = fibo2;
                    fibo2 = fibo;

                    System.out.print(fibo + " ");
                }
                
            }
            System.out.println();
        }

        leitura.close();
    }
}
