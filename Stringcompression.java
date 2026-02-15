public class Stringcompression {

    public static String compression(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            Integer c=1;                // to add integer into string so make class Integer not variable
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                c++;
                i++;

            }
            ans+=s.charAt(i);
            if(c>1){
                ans+=c;
            }
        }
        return ans;

        // StringBuilder a= new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     int c=1;
        //     while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
        //         c++;
        //         i++;
        //     }
        //     a.append(s.charAt(i));
        //     if(c>1){
        //         a.append(c);
        //     }
        // }
        // return a.toString();
    }

    public static void main(String args[]){
        String s="aaabbcccdd";
        System.out.println(compression(s));
    }
    
}
