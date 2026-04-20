import java.util.*;
public class inputOutput {
    public static void main(String args[]){
        int marks[]=new int[100];               //array marks created of size 100
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();      //chem
        marks[1]=sc.nextInt();      //phy
        marks[2]=sc.nextInt();      //math

        System.out.println("Phy "+marks[0]);
        System.out.println("Chem "+marks[1]);
        System.out.println("Math "+marks[2]);

        marks[2]=100;           //updation in array
        System.out.println("Updated maths "+marks[2]);  
    }
    
}
