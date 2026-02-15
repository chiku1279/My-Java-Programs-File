public class Switch{
    public static void main(String args[]){
        int n=2;

        switch(n){                                  // n check with case number 1,2,3...
            case 1: System.out.println("Samosa");       //If we dont use break then whenever switch occurs the rest aftr tha is execute
                    break;
            case 2: System.out.println("Maggi");
                    break;
            case 3:System.out.println("MoMo");
                    break;
            default:System.out.println("Wake up");
        }
    }
}