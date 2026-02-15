public class Transpose {

    public static void transpose(int a[][]){
        int n=a.length; // row
        int m=a[0].length;  //column
        int b[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][i]=a[i][j];
            }
            
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");

            }
            System.out.println();
        }



    }
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6}};
        transpose(a);
    }
    
}
