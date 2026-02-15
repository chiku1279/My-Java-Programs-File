public class Diamond {
    public static void pattern(int n){
        // for upper diamond
        for(int i=1;i<=n;i++){
            // for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // for star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for lower diamond
        for(int i=n;i>=1;i--){          //  opposite of upper
            // for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // for star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        pattern(5);
    }
}
