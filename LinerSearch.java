public class LinerSearch {

    public static int search(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int a[]={12,32,34,45,11,8,14,5};
        int key=11;
        int index=search(a,key);
        if(index==-1){
            System.out.println("Key Not Found ");
        }
        else{
            System.out.println("Key at index "+index);
        }
    }
    
}
