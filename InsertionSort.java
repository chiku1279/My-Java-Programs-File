public class InsertionSort {

    public static void Sort(int a[]){
        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int pre=i-1;
            while(pre>=0 && a[pre]>curr){
                a[pre+1]=a[pre];
                pre--;
            }
            a[pre+1]=curr;
        }
    }
    public static void printSort(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String args[]){
        int a[]={5,6,2,3,4,1};
        Sort(a);
        printSort(a);
    }
    
}
