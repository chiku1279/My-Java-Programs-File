import java.util.*;
public class Binary_Decimal {

    public static int Decimal(int n){
        int pow=0;
        int d=0;
        while(n>0){
            int ld=n%10;
             d= d + (ld* (int)Math.pow(2,pow));     //Math.pow gves by default double as result so type casting is req
            pow++;
            n/=10;
        }
        return d;
    }

    public static void main(String args[]){
        System.out.println(Decimal(1010));
    }
    
}
