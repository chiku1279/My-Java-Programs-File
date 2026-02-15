public class CountingSort {

    public static void sort(int a[]){

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest,a[i]);         // find the size the count array it same as the largest elemnt in array
        }

        int count[]=new int[largest+1];     // count array is +1 the size bcz start with 0
        for(int i=0;i<a.length;i++){
            count[a[i]]++;                  // put the frequency in count arry
        }
        int j=0;
        for(int i=0;i<count.length;i++){          // make the original as perr freq
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }

        
      }
      public static void print(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            
        }
    }
    public static void main(String args[]){
        int a[]={4,2,5,1,3,2,1};
        sort(a);
        print(a);

    }
    
}
