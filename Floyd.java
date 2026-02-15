public class Floyd {
    public static void floyd(int n){
        int c=1;                // for number printing
        for(int i=1;i<=n;i++){      //outer loop
            
            for(int j=1;j<=i;j++){      //inner loop 
                System.out.print(c+" ");
                c++;                        //value increase each time
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyd(5);
    }
    
}
