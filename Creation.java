import java.util.*;
public class Creation {
    public static void main(String args[]){
        char a[]={'a','b','c','d'};
        String str="Chiku";

        Scanner sc=new Scanner(System.in);

        //String name=sc.next();              //.next doesn't take the space as input
        String name1=sc.nextLine();          // takes space as well
        //System.out.println(name);

        System.out.println(name1);
        System.out.println(name1.length());

    //Concatenation
    System.out.println("Chiku"+"singh");

    //.charAt
    System.out.println(name1.charAt(0));

    }
    
}
