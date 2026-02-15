public class Largest {

    public static int largest(int a[]){
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum is ="+ min);
        return max;
        
    }

    public static void main(String args[]){
        int a[]={10,22,3,24,45,11,23};
        System.out.println("Maximum is ="+ largest(a));
        

    }
    
}
