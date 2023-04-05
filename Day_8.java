import java.util.*;
import java.io.*;

class Day_8{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
		//Map is a kind of datatype which stores data in key value pairs
		//Following is the syntax
        Map<String,Integer> Contact =new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
			//The put method is used to upload a new key value pair to the map
            Contact.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
			//containKey returns true if the key is found in our map or else false
            if(Contact.containsKey(s)){
				//The get method is used to get the value of the key mentioned
                System.out.println(s+"="+Contact.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}