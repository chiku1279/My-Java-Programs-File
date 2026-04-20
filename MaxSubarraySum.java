public class MaxSubarraySum{

    public static void subarraySum(int a[]){
        int maxSum=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;
                curr=0;
                for(int k=start;k<=end;k++){
                    curr+=a[k];
                    
                }
                System.out.println(curr);
                if(curr>maxSum){
                    maxSum=curr;
                }
                
                
            }
        }
        System.out.println("Maximum Sum ="+maxSum);
    }
    public static void main(String args[]){
        int a[]={2,-3,5,-1,2,4};
        subarraySum(a);
    }
}