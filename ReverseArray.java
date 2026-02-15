public class ReverseArray {

    public static void reverse(int a[]){
        int start=0;        //start pointer
        int end=a.length-1; //end pointer
        while(start<end){               //not for == bcz the middle remains on same position
            int temp=a[end];        //swap logic
            a[end]=a[start];
            a[start]=temp;
            start++;
            end--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }

    }

    public static void main(String args[]){
        int a[]={10,5,3,11,18,21};
        reverse(a);
    }
    
}
