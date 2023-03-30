import java.io.*;

class Day_3{
		public static void main(String[] args) throws Exception{
				
				BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));
				
				int n = Integer.parseInt(bfreader.readLine().trim());
				
				//if statements are like flipping a coin
				//if our condition is true one task will be done
				//if our condition is false another task will be run
				//n%2 will give the remained and if it is not equals to zero
				//then the task mentioned in if block will be executed
				//or else, the statements in else block will be executed
				if(n%2!=0){
					System.out.println("Weird");
				}else{
					if(n%2==0 && (n>1 && n<6)){
						System.out.println("Not Weird");
					}else if(n%2==0 && (n>5 && n<21)){
						System.out.println("Weird");
					}else if(n%2==0 && (n>20)){
						System.out.println("Not Weird");
					}
				}
		}
}