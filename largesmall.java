import java.util.*;
public class largesmall {

    public static void findmatrix(int a[][]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]<min){
                    min=a[i][j];
                }
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        findmatrix(a);
    }
    
}
