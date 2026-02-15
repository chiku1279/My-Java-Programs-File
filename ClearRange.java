public class ClearRange {

    public static void clearRange(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        System.out.println(n&bitmask);
    }

    public static void main(String args[]){
        int n=15,i=2,j=7;
        clearRange(n,i,j);
    }
    
}
