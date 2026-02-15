public class PrimeRange {

    public static boolean isPrime(int n){       //function to check ek number as prime
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){          //function to check each number in range
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
            
        }
    }

    public static void main(String args[]){
        primeRange(20);
    }
    
}
