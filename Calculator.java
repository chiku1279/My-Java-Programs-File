import java.util.*;

public class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter B :");
        int b=sc.nextInt();
        System.out.println("Enter Operand :");
        char operator=sc.next().charAt(0);      // charAt(0) for single character only

        switch(operator){
            case '+':System.out.println(a+b);
                        break;
            case '-':System.out.println(a-b);
                        break;
            case '*':System.out.println(a*b);
                        break;
            case '/':System.out.println(a/b);
                        break;
            case '%':System.out.println(a%b);
                        break;
            default:System.out.println("Wrong operand");
        }

    }
}