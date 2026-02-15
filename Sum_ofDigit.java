public class Sum_ofDigit {

    public static void sumDigit(int n){
        int a=n;                            // after calculation n is becoming 0 so store in vari
        int sum=0;
        do{
            int r=n%10;
            sum+=r;
            n/=10;
        } while(n>0);

        System.out.println("Sum of Digit for "+ a +" is " +sum);
    }
    public static void main(String args[]){
        sumDigit(234);

        
    }
    
}
