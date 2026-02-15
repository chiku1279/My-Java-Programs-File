public class Reverse_ofNumber{
    public static void main(String args[]){
        int n=12345;
        int rev=0;
        while(n>0){
            int last_digit=n%10;        // to get last digit
            rev=rev*10 + last_digit;    // to make the digit places
            n=n/10;                     // to remove the last digit
        }
        System.out.println(rev);
    }
}