import java.util.*;
import java.io.*;

class Day_4{
		private int age;	//instance variable. Value varies from instance to instace;
		
		//Constructor. Initializes the class instance
		//If any statements or code should be run at the moment an instance of class is created
		//we can place that in constructor
		//Constructor should have same name as class name
		//2 types of constructor \
		//i. default constructor - constructor without any arguments
		//ii. parameterized constructor - constructor with some arguments - as in our case
		public Day_4(int initialAge){
			if(initialAge>=0){
				this.age = initialAge;
			}else{
				this.age = 0;
				System.out.println("Age is not valid, setting age to "+age);
			}
		}
		
		//method of the class
		public void yearPasses(){
				this.age+=1;
		}
		
		//method of the class
		public void amIOld(){
				if(age<13){
						System.out.println("You are young.");
				}else if(age>12 && age<18){
						System.out.println("You are a teenager.");
				}else{
						System.out.println("You are old.");
				}
		}

		public static void main(String[] args) throws Exception{
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Please enter number of testcases : ");
			int T = Integer.parseInt(bufferedReader.readLine().trim());
			
			for(int i=0;i<T;i++){
				System.out.println("Please enter age");
				int age = Integer.parseInt(bufferedReader.readLine().trim());
				Day_4 day_4 = new Day_4(age);	//this is how we create an object. the argument age will be passed to constructor
				day_4.amIOld();
				day_4.yearPasses();
				day_4.yearPasses();
				day_4.yearPasses();	
				day_4.amIOld();
			}			
		}
}