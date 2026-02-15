public class Palindrome {

    public static void palindrome(int n){
        int a=n;
        int r=0;
        while(n>0){
            int rem=n%10;
            r=r*10+rem;
            n/=10;
        }
        if(a==r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String args[]){
        palindrome(121);

    }
    
}
