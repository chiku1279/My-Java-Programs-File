import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        if(n==2){                                   //Smallest prime  number
            System.out.println(n+ " is Prime");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){               // Math.sqrt is a class in util package
                if(n%i==0){
                    isPrime=false;
                }
                
            }
            if(isPrime==true)
            {
                System.out.println(n+" is Prime");
            }
            else{
                System.out.println(n+" is Not Prime");
            }
        }
    }
}