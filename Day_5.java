//import java.util.*;
import java.io.*;

class Day_5{
		
		public static void main(String[] args) throws Exception{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please enter any integer : ");
			int n = Integer.parseInt(bufferedReader.readLine().trim());
			
			//loops concept is used to repeat a task
			//syntax is for(initialization;condition to end;updation)
			//initialization is part where we start the loop
			//second we give a condition, where the loop terminates
			//if we don't give correct condition, then loop runs infinitely and that's a problem
			//third part is where we update the inital value
			for(int i = 1;i<11;i++){
					System.out.printf("%d x %d = %d\n",n,i,n*i);
			}
		}
	
}