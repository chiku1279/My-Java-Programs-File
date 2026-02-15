import java.util.*;
public class Kadanes {

    public static void maxSum(int a[]){
        int curr=0;
        int mSum=Integer.MIN_VALUE;
        
        
        for(int i=0;i<a.length;i++){
            curr=curr+a[i];             //if new curr is >0 thn only update in mSum
            if(curr<0){                 // curr <0 to thn make currr=0
                curr=0;
            }
            mSum=Math.max(curr,mSum);
        }
        if(mSum==0){
            negetive(a);            // if mSUm==0 means all value is -ve in the array so print the largest
        }
        else{
            System.out.println("Maximum Sum= "+mSum);
        }
        
    }
    public static void negetive(int a[]){           // for all value is negetive thn print the smallest
        int mx=Integer.MIN_VALUE;               
        for(int i=0;i<a.length;i++){
            if(a[i]>mx){
                mx=a[i];
            }
        }
        System.out.println("Maximum= "+mx);
    }
// for negetive and positive array

    // public static void maxSumKadanes(int a[]){
    //     int curr=0;
    //     int maxSum=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         curr+=a[i];
    //         if(curr>maxSum){
    //             maxSum=curr;
    //         }
    //         if(curr<0){
    //             curr=0;
    //         }
    //     }
    //     System.out.println("Maximum sum="+maxSum);
    // }
    public static void main(String args[]){
        int a[]={3,5,-1,-4,2};
        maxSum(a);
    }
    
}
