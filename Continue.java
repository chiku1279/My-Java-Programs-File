public class Continue{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;               // Continue skip only where condition occours
            }
            System.out.println(i);
        }
    }
}