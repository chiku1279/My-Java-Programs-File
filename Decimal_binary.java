public class Decimal_binary {

    public static int binary(int n){
        int b=0;
        int p=0;
        while(n>0){
            int r=n%2;
            b=b + r*(int)Math.pow(10,p);
            p++;
            n/=2;
        }
        return b;
    }
    public static void main(String args[]){
        System.out.println(binary(10));
    }
    
}
