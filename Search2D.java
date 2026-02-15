public class Search2D {

    public static boolean staircase(int a[][],int key){

        //Taking top right elemet as starting
        int row=0;
        int col=a[0].length-1;
        while(row<a.length && col>=0){
            if(a[row][col]==key){
                System.out.println("Found at index ("+row+", "+col+")");
                return true;
            }
            else if(a[row][col]<key){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("Not found");
        return false;
        
        //Taking bottom left element as starting

        // int row=a.length-1;
        // int col=0;
        // while(row>=0 && col <a[0].length){
        //     if(a[row][col]==key){
        //         System.out.println("Found at index ("+row+", "+col+")"); 
        //         return true;
        //     }
        //     else if(a[row][col]<key){
        //         col++;
        //     }
        //     else{
        //         row--;
        //     }
        // }
        // System.out.println("Not found");
        // return false;
    }

    public static void main(String args[]){
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=10;
        staircase(a,key);
    }
    
}
