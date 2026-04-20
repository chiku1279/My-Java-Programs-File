public class PairsArray {

    public static void pair(int a[]){
        int totalpair=0;
        for(int i=0;i<a.length;i++){  // for first element in pair
            for(int j=i+1;j<a.length;j++){          //for second eleemnt in pair
                System.out.print("(" +a[i] +"," +a[j] +")");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("Total pair available="+totalpair);
    }

    public static void main(String arg[]){
        int a[]={2,4,6,8,10};
        pair(a);
    }
    
}
