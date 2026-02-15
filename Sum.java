import java.util.*;
public class Sum{

    public static int Addition(int a,int b){
        
        int sum = a+b;
        return sum;
        

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=Addition(a,b);              //store the answer of Addition class i,e sum value in this sum
        
        System.out.println(sum);
        
    }
}