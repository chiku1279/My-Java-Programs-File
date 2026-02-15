public class Overloading{

    // function sum for 2 prameters
    public static int sum(int a,int b){
        return a+b;
    }
    //function for 3 parameters
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    //function with 2 parameters but differnent type

    public static float sum(float a,float b){
        return a+b;
    }
    
    public static void main(String args[]){
        System.out.println(sum(2,3));
        System.out.println(sum(3,4,5));
        System.out.println(sum(3.4f,4.6f));
    }
}