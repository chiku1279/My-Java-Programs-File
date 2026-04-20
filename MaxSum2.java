public class MaxSum2 {

    public static void sumArray(int a[]){
        int prefix[]=new int[a.length]; //make a prefix array
        prefix[0]=a[0];                 //initilize p[0] to the a[0]
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=1;i<prefix.length;i++){       //make the prefix array
            prefix[i]=prefix[i-1]+a[i];
        }


        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;

                currSum=start==0? prefix[end] : prefix[end]-prefix[start-1]; // if i=0 thn [start-1]=-1 so we use ternary
                
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum sum= "+maxSum);
    }

    public static void main(String args[]){
        int a[]={1,-2,6,-1,3};
        sumArray(a);
    }
    
}
