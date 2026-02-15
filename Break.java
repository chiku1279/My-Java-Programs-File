import java.util.*;
public class Break{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            int n=sc.nextInt();
            if(n%10==0){
                break;                  // after break none statement execute of the loop
            }
            System.out.println(n);
        } while(true);
        System.out.println("Multiple of 10 ---");
    }
}