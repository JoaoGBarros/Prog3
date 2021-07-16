package J1_05;
import java.util.Scanner;
public class J1_05 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int vetor[] = new int[10];
        int diferenca = 0, ultimaDiferenca = 0, contadorDif = 0;
        String PA;
        


        for(int contador = 0; contador < 10; contador++){
            vetor[contador] = leitura.nextInt();
        }

        for(int contador = 0; contador < 10; contador++) {
            if(contador+1 < 10){
                diferenca = vetor[contador+1] - vetor[contador];
                if(contador > 0){
                    if(diferenca == ultimaDiferenca){
                        contadorDif++;
                    }
                }
            }
            ultimaDiferenca = diferenca;
        }

        
        if(contadorDif == 8){
            PA = new String("Sim");
        }else{
            PA = new String("Nao");
        }

        System.out.print(PA);

        if(PA.equals("Sim")){
            System.out.print(" " + vetor[0] + " " + ultimaDiferenca);
        }
        System.out.println();

        leitura.close();
    }
}
