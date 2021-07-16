package J1_04;
import java.util.Scanner;
public class J1_04 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        int vetor[] = new int[10];
        int contador, diferenca, x, qtdMaior = 0, qtdMenor = 0, qtdIgual = 0, contadorCrescente = 0, contadorDecrescente = 0;
        int posicaoMaior = 0, posicaoMenor = 1, maiorDistancia = 0;
        String ordem;

        for(contador = 0; contador < 10; contador++){
            vetor[contador] = leitura.nextInt();
        }

        x = leitura.nextInt();

        for(contador = 0; contador < 10; contador++){

            if(contador+1 < 10){
                diferenca = vetor[contador] - vetor[contador+1];

                if(diferenca > 0){
                    contadorDecrescente++;
                }else if(diferenca < 0){
                    contadorCrescente++;
                    diferenca*=-1;
                }

                
                if(diferenca > maiorDistancia){
                    maiorDistancia = diferenca;
                    posicaoMaior = contador;
                    posicaoMenor = contador+1;
                }
            }

            if(vetor[contador] > x){
                qtdMaior++;
            }else if(vetor[contador] < x){
                qtdMenor++;
            }else if(vetor[contador] == x){
                qtdIgual++;
            }

        }

        if(contadorCrescente == 9){
            ordem = new String("Crescente");
        }else if(contadorDecrescente == 9){
            ordem = new String("Decrescente");
        }else{
            ordem = new String("Nao ordenado");
        }

        System.out.printf("%d %d %s %d %d %d\n", posicaoMaior, posicaoMenor, ordem, qtdMaior, qtdMenor, qtdIgual);
        leitura.close();
    }
}
