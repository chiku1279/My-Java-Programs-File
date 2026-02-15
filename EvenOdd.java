public class EvenOdd {

    public static void evenodd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even ");
        }
        else{
            System.out.println("Odd ");
        }
    }

    public static void main(String args[]){
        evenodd(3);
        evenodd(11);
        evenodd(6);

    }
    
}
