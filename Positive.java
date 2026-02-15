import java.util.*;
public class Positive{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(n==0?0 :(n>0?1:-1));

        switch(a){
            case 0:System.out.println("Zero");
            break;
            case 1:System.out.println("Positive");
            break;
            case -1:System.out.println("Negetive");
            break;
            default:System.out.println("Unexpected");
        }
    }
}