import java.io.*;
import java.util.*;

class Day_10{
	
		public static void main(String[] args) throws Exception{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("PLease enter numbers : ");
				//.toBinaryString , as the name says it converts number into string of binary
				String bin = Integer.toBinaryString(Integer.parseInt(bufferedReader.readLine().trim()));
				//I adopted the following method from internet
				//In the following method we're dividing the binary string into string arrays, by splitting them with zeroes
				//After that calculating the lenght of each string and printing the maximum one;
				String[] bins = bin.split("0");
				int max = 0;
				for(String s : bins){
					if(max < s.length()){
						max = s.length();
					}
				}
				System.out.println(max);
    }
}