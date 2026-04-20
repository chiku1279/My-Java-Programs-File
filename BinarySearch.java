public class BinarySearch {

    public static int binary(int a[],int key){
        int start=0;
        int end=a.length-1;
        while(start<=end){                  //<= for the single element where mid==start==end
            int mid=(start+end) / 2;
            if(a[mid]==key){                //middle condition
                return mid;
            }
            else if(a[mid]>key){            //left side
                end=mid-1;                  
            }
            else{
                start=mid+1;                //right side
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int a[]={5,10,12,15,18,22};             //must in sorted order
        int key=18;
        System.out.println("Key at index :"+binary(a,key));
    }
    
}
