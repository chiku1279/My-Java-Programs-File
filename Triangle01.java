public class Triangle01 {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){

            //for inner loop
            for(int j=1;j<=i;j++){
                int sum=0;
                sum=i+j;
                if(sum%2==0){       //if the row+ coloumn is even thn 1
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
    
}
