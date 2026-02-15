public class FastExpo {

    public static int expo(int a,int b){
        int ans=1;
        while(b>0){
            if((b&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            b=b>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        int a=5,b=3;
        System.out.println(expo(a,b));
    }
    
}
