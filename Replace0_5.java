public class Replace0_5 {

    public static void replace0(int a){
        int r=0;
        int m=1;
        while(a>0){
            int rem=a%10==0 ? 5 : a%10;        // if rem is 0 make it 5
            r=m*rem + r;                    // add each time the reminder 
            m*=10;
            a/=10;
        }
        System.out.println("Replaced :"+r);
    }
    public static void main(String args[]){
        int a=12030;
        replace0(a);
    }
    
}
