import java.util.Scanner;
public class Creation2D {

    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);

        // Creation of matrix/2D
        int a[][] = new int[3][2];
        // int n=3;    //no of rows
        // int m=2;    //no of column

        // find the number of rows and column
        int n=a.length;
        int m=a[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }

        //Print the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }
    
}
