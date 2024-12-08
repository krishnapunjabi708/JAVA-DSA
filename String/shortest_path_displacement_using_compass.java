public class shortest_path_displacement_using_compass {
    
    public static float displacement(String path){
        char dir;
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
         dir=path.charAt(i);
         //West
        if(dir=='W'){
           x--;
        }
        //South
        else if(dir=='S'){
           y--; 
        }
        //East
        else if(dir=='E'){
            x++;
        }
        //North
        else{
            y++;
        }
    }
return (float)(Math.sqrt(x*x+y*y));
}
public static void main(String[] args) {
    String path="WNEENESENNN";
   float dis= displacement(path);
   System.out.println("The Total Displacement is "+dis);
}
}
