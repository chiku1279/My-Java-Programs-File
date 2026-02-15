public class Alphabet{
    public static void main(String args[]){
        char c='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;                        // A+1=B+1=C...
            }
            System.out.println();
        }
    }
}