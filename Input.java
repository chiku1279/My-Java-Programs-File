import java.util.*;             // take all package of util in program
public class Input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);        //Scanner class makes an object sc

        //String name=sc.next();                      //.next takes the input but not Spaces
        //System.out.println(name);

        String fullname=sc.nextLine();              //.nextLine takes the Spaces as well
        System.out.println(fullname);
        
        int n=sc.nextInt();                         //.nextInt is for Integer 
        System.out.println(n);

        boolean b=sc.nextBoolean();
        System.out.println(b);
    }
}