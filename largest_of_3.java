public class largest_of_3{
    public static void main(String args[]){
        int a=8;
        int b=51;
        int c=6;
        if(a>=b && a>=c){
            System.out.println("A");
        }
        else if(b>=c){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }
}