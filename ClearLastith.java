public class ClearLastith {

    public static void main(String args[]){
        int i=2;
        int n=15;
        int bitmask= (~0)<<i;
        System.out.println(n& bitmask);     // 1111 clear last 2 bits = 1100
    }
    
}
