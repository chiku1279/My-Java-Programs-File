import java.util.*;
public class Directio {

    public static float getShortestpath(String path){
        int x=0,y=0;        //intitally at (0,0)

        for(int i=0;i<path.length();i++){

            //North
            if(path.charAt(i)=='N'){
                y++;
            }

            //South
            else if(path.charAt(i)=='S'){
                y--;
            }
            
            //East
            else if(path.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        //find the distance 
        int X=x*x;
        int Y=y*y;
        float distance=(float)Math.sqrt(X+Y);        // by default .sqrt gives double value
        return distance;
    }
    public static void main(String args[]){
        String path="EWNNSWWES";
        System.out.println(getShortestpath(path));
    }
    
}
