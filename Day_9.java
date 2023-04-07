import java.io.*;

class Day_9{
		//The following is a recursive method
		//Let's take the case of 3
		//Step 1 ---> 3 > 1 = true so 3 * factorial(2), as we're calling factorial(2) nxt step : 
		//Step 2 ---> 2 > 1 = true so 2 * factorial(1), now again the method will be called
		//Step 3 ---> 1 > 1 = false so it returns 1,
		//now this 1 is sent to step 2 which is ---> 2 * 1 = 2
		//this 2 is returned to step 1 which is ---> 3 * 2 = 6
		//this is the final answer and returned to variable factorial;
		//this is how a recursive method works
		//it should have a repetitive case and base case where repetition ends
		//here repetitive case is mentioned in if and
		//base case is mentioned in else 
		private static int factorial(int n){
				if(n>1){
						return n * factorial(n-1);
				}else{
						return 1;
				}
		}
	
	
	
		public static void main(String[] args) throws Exception{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(bufferedReader.readLine().trim());			
			int factorial = Day_9.factorial(n);
			System.out.println(factorial);
		
		}
	
}