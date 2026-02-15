public class functionArray {

    public static void arrayUpdate(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }

    public static void main(String args[]){
        int marks[]={95,96,97};
        arrayUpdate(marks);         //call the function arrayUpdate with marks array as argument

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

    }
    
}
