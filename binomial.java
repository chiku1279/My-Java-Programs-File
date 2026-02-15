public class binomial{

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }

    public static int bino(int n,int r){
        int fn=factorial(n);
        int fr=factorial(r);
        int fnr=factorial(n-r);
        
        int bin=fn/(fnr*fr);
        return bin;

    }
    public static void main(String args[]){
        
        
        System.out.println(bino(5,2));
    }
}