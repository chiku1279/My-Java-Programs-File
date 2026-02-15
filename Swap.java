public class Swap{

    public static void swapValue(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);      //if we use this Syso in main method the actual value was print bcz CBV
        System.out.println(b);
    }
    public static void main(String args[]){
        int a=10;
        int b=5;
        swapValue(a,b);
        
    }
}