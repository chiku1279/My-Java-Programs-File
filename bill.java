import java.util.*;
public class bill{


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    float pencil=sc.nextFloat();
    float pen=sc.nextFloat();
    float eraser=sc.nextFloat();
    float Total=pencil+pen+eraser;
    System.out.println("Total Bill " + Total);
    System.out.println("GST Total " + ((Total*0.18)+Total));
    
}
}