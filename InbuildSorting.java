import java.util.Arrays;
import java.util.Collections;
public class InbuildSorting {

    public static void sortfn(int a[]){
        Arrays.sort(a);
    }

    //Sort in a range

    // public static void rangeSort(int a[]){
    //     Arrays.sort(a,0,3);
    // }

    // Reverse sort

    // public static void reverseSort(Integer a[]){
    //     Arrays.sort(a,Collections.reverseOrder());      //  for collection take only object so int= Integer in all place
    // }
    
    // Reverse sort Range

    // public static void reverseRange(Integer a[]){
    //     Arrays.sort(a,0,3,Collections.reverseOrder());
    // }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[]={4,2,5,1,6,3};
        sortfn(a);
        //rangeSort(a);
        //reverseSort(a);
        //reverseRange(a);
        print(a);
    }
    
}
