public class else_if{
    public static void main(String args[]){
        int age=18;

        if(age>=18){                            //if first if is true then rest is not checked
            System.out.println("Adult");
        }
        else if( age>=13 && age<=18){
            System.out.println("teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}