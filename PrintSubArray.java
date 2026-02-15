public class PrintSubArray {

    public static void subarray(int a[]){
        int totalsubarray=0;
        for(int i=0;i<a.length;i++){                // for initial
            int start=i;
            for(int j=i;j<a.length;j++){            // for subarray
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(a[k]+" ");

                }
                totalsubarray++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray = "+totalsubarray);
    }

    public static void main(String args[]){
        int a[]={2,4,6,8,10};
        subarray(a);

    }
    
}
