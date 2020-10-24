import java.util.*;

public class Swayamvar{
    public static void main(String [] ak){
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        int count = 0;
        
        if(number >= 1 && number <= 10000){    
            String []b = scan.next().split("");
            String []g = scan.next().split("");
                
            ArrayList<String> bride = new ArrayList<String>();
            ArrayList<String> groom = new ArrayList<String>();
                
            for(String s : b) bride.add(s);
            for(String s : g) groom.add(s);
            
            int size = bride.size();
            
            while(!bride.isEmpty()){
                if(groom.contains(bride.get(0))){                    
                    String abc = bride.get(0);
                    
                    bride.remove(0);
                    groom.remove(new String(abc));
                    
                    count++;
                }
                else bride.clear();
            }
            
            System.out.print(number-count);
        }
    }
}
