public class NumberofSetbits {

    public static int countSet(int n){
        int c=0;
        while(n>0){
            if((n&1)!=0){
                c++;
            }
            n=n>>1;
        }
        return c;
    }

    public static void main(String args[]){
        int n=10;
        System.out.println(countSet(n));
    }
    
}
