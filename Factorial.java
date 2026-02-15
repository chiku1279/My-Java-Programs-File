import java.util.*;
public class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which factorial do you want:");
        int n=sc.nextInt();
        int f=1;
        if(n==1 || n==0){
            f=1;
            System.out.println("Factorial of "+n +"=" +f);

        }
        else if(n<0){
            System.out.println("Error");
        }

        else{
            for(int i=1;i<=n;i++){
                f*=i;
            }
            System.out.println("Factorial of "+n +"=" +f);
        }
    }
}