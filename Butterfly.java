public class Butterfly {

    public static void pattern(int n){
        // for upper pattern
        for(int i=1;i<=n;i++){
            //for i star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for 2*(n-i) spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for i star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //for lower pattern
        for(int i=4;i>=1;i--){
            //for i star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for 2*(n-i) spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for i star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String args[]){
        pattern(4);
    }
    
}
