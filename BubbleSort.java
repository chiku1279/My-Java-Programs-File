public class BubbleSort{
    public static void Bubble(int a[]){
        for(int turn=0;turn<a.length-1;turn++){
            
            for(int j=0;j<a.length-1-turn;j++){
                if(a[j]>a[j+1]){
                    //swap
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    
                }
            }
        }
    
    }
    //for sort array print
    public static void printSort(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    public static void main(String args[]){
        int a[]={5,3,6,1,2};
        Bubble(a);
        printSort(a);

    }

}