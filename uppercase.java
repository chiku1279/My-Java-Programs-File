public class uppercase {

    public static String toUpper(String s){
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()-1){     // second condition is if the last char is space
                sb.append(s.charAt(i));                   //append the space as it is
                i++;                                    // after the space we have to  make lower into upper
                sb.append(Character.toUpperCase(s.charAt(i)));  //append the converted lower 
            }
            else{
                sb.append(s.charAt(i));       // other character append as it is
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String s="my name Is chiku";
        System.out.println(toUpper(s));
    }
    
}
