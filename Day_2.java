import java.util.*;	
import java.util.stream.*;	//import statement for inputstreamreader
import java.io.*;	//import statement for bufferedreader

class Day_2{
	
		public static void main(String[] args) throws Exception{
				
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				//BufferedReader is a class similar to Scanner class. we use this class to read large text input
				//InputStreamReader class is used to bridge the byte-based input of System.in to the character-based input of the BufferedReader.
				//So this means, the scanner class will parse the byte data automatically
				//But while using BufferedReader, the input is taken in form of characters and we need to parse it accordingly. Shown below
				
				double mealCost = Double.parseDouble(bufferedReader.readLine().trim());
				//Here we're taking Double as input using bufferedReader
				//The readLine() methods take the whole line as input.
				//By using trim() we remove the leading and trailing edge spaces
				//After this our number will be present as characters and now we are parsing it using parse data technique
				//This is how we use bufferedReader class for reading
				//BufferedReader is more efficient at reading large amounts of text from an input stream
				//Scanner is more efficient at parsing data types like integers and floats from an input stream
				
				int tipPercent = Integer.parseInt(bufferedReader.readLine().trim());
				
				int taxPercent = Integer.parseInt(bufferedReader.readLine().trim());
				
				bufferedReader.close();
				
				Day_2.solve(mealCost,tipPercent,taxPercent);
				//This is way to call the method present in same class
				
				
		}
		
		//This is a method which takes the values mentioned in parentheses as arguments and operate upon them
		public static void solve(double mealCost, int tipPercent, int taxPercent){
			
			double tip = (double)(tipPercent)*mealCost/100;
			double tax = (double)(taxPercent)*mealCost/100;
			double total = mealCost + tip + tax;
			
			System.out.println("The total bill is : "+Math.round((total)));
			//Math.round() is a technique to round any double value to nearest integer
		}

}