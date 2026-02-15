public class SelectionSort {

    public static void Sort(int a[]){
        for(int i=0;i<a.length-1;i++){          // both loops run n-1 times times
            int min=i;                          // make current as minimum
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){                // check with ech element aftr currnt to check the min
                    min=j;
                }
            }
            //swap              
            int temp=a[min];            // swapping isdone at last when we got smallent each time
            a[min]=a[i];
            a[i]=temp;
        }
    }

    public static void printSort(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        int a[]={5,3,6,1,2,4};
        Sort(a);
        printSort(a);

    }
    
}
