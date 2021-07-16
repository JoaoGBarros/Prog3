package J1_01;
import static java.lang.Math.*;
public class J1_01{
    public static void main(String[] args){
        int contador;
        double num, den;
        double s1 = 0, s2 = 0, s3 = 0;

        for(num = 1, den = 1; num < 100; num += 2, den++){          
            s1 = s1 + (num/den);
        }

        for(num = 1, den = 50; den > 0;  num++, den--){
            s2 = s2 + (pow(2, num))/den;
        }

        for(num = 1, contador = 0; num <= 10; num++, contador++){
            den = pow(num, 2);
            if(contador % 2 == 0){
                s3 = s3 + (num/den);
            }else{
                s3 = s3 - (num/den); 
            }
            
        }

        System.out.println("S1 = " + s1);
        System.out.println("S2 = " + s2);
        System.out.println("S3 = " + s3);
    }
}