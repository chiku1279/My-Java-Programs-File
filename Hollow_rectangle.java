public class Hollow_rectangle {

    public static void hollow(int rows,int cols){
        //outer loop for rows
        for(int i=1;i<=rows;i++){
            //inner loop for columns
            for(int j=1;j<=cols;j++){
                    //boundary condition for star ( row==1||row==4 || cols==1||cols==5)
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        hollow(4,5);
    }
    
}
