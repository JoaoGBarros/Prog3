package J1_02;
import static java.lang.Math.*;
public class J1_02 {
    public static void main(String[] args) {
        int contador;
        int ab, cd, ef;

        for(contador = 1000; contador < 9999; contador++){
            ab = contador / 100;
            cd = contador % 100;
            ef = ab + cd;

            if(pow(ef, 2) == contador){
                System.out.println(contador);
            }
        }
    }
}
