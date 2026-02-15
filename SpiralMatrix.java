public class SpiralMatrix {

    public static void Spiral(int a[][]){
        int startRow=0;
        int startColumn=0;
        int endRow=a.length-1;
        int endColumn=a[0].length-1;

        while(startRow<=endRow && startColumn<=endColumn){

            //Top
            for(int i=startColumn;i<=endColumn;i++){
                System.out.print(a[startRow][i]+" ");
            }

            //Right
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(a[j][endColumn]+" ");
            }

            //Bottom
            for(int i=endColumn-1;i>=startColumn;i--){
                System.out.print(a[endRow][i]+" ");
            }

            //Left
            for(int j=endRow-1;j>=startRow+1;j--){
                System.out.print(a[j][startColumn]+" ");
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;

        }
    }
    public static void main(String args[]){
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral(a);

    }
    
}
