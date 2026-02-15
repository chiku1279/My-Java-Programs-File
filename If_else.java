public class If_else{
    public static void main(String args[]){
        int age=22;

        if(age>=18){
            System.out.println("Adult,Drive");      //if condition true this block execute
        }
        /*if(age>=13 && age<=19){
            System.out.println("Teenager");
        } */
       
        else{
            System.out.println("Not Adult");        // not true this block execute
        }
    }
}