public class Unary{
    public static void main(String args[]){
        int a=10;
        int b=++a;                  // pre-increment first change than use
        System.out.println(a);
        System.out.println(b);
        
        int c=10;
        int d=c++;                 // post increment first use than change
        System.out.println(c);
        System.out.println(d);
    }
}