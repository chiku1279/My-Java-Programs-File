public class LowertoUpper {

    public static String toUpper(String a){
        int n=32;
        char ans[]=a.toCharArray();
        for(int i=0;i<a.length();i++){
            ans[i]=(char)(ans[i] & (~n));
        }
        String s=new String(ans);
        return s;
    }
    public static void main(String args[]){
        String a="bbanShaN";
        System.out.println(toUpper(a));
    }
    
}
