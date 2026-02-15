
public class Type_pramotion{
    public static void main(String args[]){
        char a='a';
        char b='b';
        
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);        //type pramotion Pramotes only expression not the single value  

        int c=10;
        float d=20.25f;
        long e=20;
        double f=22;
        double ans=c+d+e+f;         // Takes all types as double as double is the greatest one
        System.out.println(ans);

    }
}