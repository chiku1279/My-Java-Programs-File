public class number_pyramid{
    public static void number(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner for number
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        number(5);
    }
}