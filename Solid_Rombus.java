public class Solid_Rombus {
    public static void rombus(int n){
        for(int i=1;i<=n;i++)
        {
            // for spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // for star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        rombus(5);
    }
    
}
