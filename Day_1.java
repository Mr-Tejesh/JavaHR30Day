import java.util.Scanner;	//Scanner class contains all the methods to read input

//Your file name and class name should match
class Day_1{
		public static void main(String[] args){
			//Creating an instance named read for scanner class
			Scanner read = new Scanner(System.in);
				
			//Initial variables	
			int i1 = 4;
			double d1 = 5.0;
			String s1 = "Hello";
			
			//Reading the integer
			System.out.println("Please enter any integer : ");
			int i = read.nextInt();
			read.nextLine();//To read the new line character
			//Or else the buffer won't close

			//Reading the double value
			System.out.println("Please enter any double : ");
			double d = read.nextDouble();
			read.nextLine();

			//Reading the string value
			System.out.println("Please enter any string : ");
			String s = read.nextLine();
				
			System.out.printf("%d\n%.1f\n%s\n",i1+i,d1+d,s1+s);
		}
}