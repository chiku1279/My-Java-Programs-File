public class Methods{
    public static void message(){               // Method/function of name message has no return type
        System.out.println("Hello World ");
        return;                                 // we can either use return; or not with void data type
    }
    
    public static void main(String args[]){        //First cursor finds main method thean start execution their code.
       System.out.println("Hello");
       message();                                   //Function Call
    }
}