public class Inverted {

    public static void triangle(int rows){
        for(int i=1;i<=rows;i++){
            // for spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        triangle(4);
    }
    
}
