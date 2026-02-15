String ans="";
        for(int i=0;i<s.length();i++){
            Integer c=1;
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