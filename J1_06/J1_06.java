
import java.util.Scanner;
public class J1_06 {
    public static void main(String[] args){
        double matrizA[][] = new double[5][4];
        double matrizB[][] = new double[4][6];
        double matrizResultante[][] = new double[5][6];
        double somaprod = 0;
        Scanner leitura = new Scanner(System.in);

        for(int i=0; i < matrizA.length; i++){
            for(int j=0; j < matrizA[i].length; j++){
                matrizA[i][j] = leitura.nextDouble();
            }
        }

        for(int i=0; i < matrizB.length; i++){
            for(int j=0; j < matrizB[i].length; j++){
                matrizB[i][j] = leitura.nextDouble();
            }
        }

        for(int i=0; i < matrizA.length; i++){
            for(int j=0; j < matrizB[0].length; j++){
                somaprod = 0;
                for(int k=0; k < matrizB.length; k++){
                    somaprod += matrizA[i][k] * matrizB[k][j];
                }
                matrizResultante[i][j] = somaprod;
            }
        }

        for(int i=0; i < matrizResultante.length; i++){
            for(int j=0; j < matrizResultante[i].length; j++){
                System.out.printf("%.2f ", matrizResultante[i][j]);
            }
            System.out.println();
        }

        leitura.close();
    }
}
