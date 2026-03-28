import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedMap{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();

        // lmap.put(10, "NmPersion");
        // lmap.put(20, "NmP2");
        // lmap.put(30, "mnstrg");

        for(int i=0;i<3;i++){
            System.out.println("Enter key:values");

            int key = scan.nextInt();
            String value = scan.next();

            lmap.put(key,value);
        }
        System.out.println("Traversing Map");
        for(Map.Entry<Integer,String> entry:lmap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}