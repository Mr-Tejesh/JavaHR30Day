import java.util.*;
import java.io.*;

class Day_13_sol extends Day_13_book{
	int price;
	
	Day_13_sol(String title, String author, int price) {
        super(title, author);
		this.price = price;
    }
	
	void display(){
		System.out.println("Title: "+this.title);		
		System.out.println("Author: "+this.author);		
		System.out.println("Price: "+this.price);		
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter title of the book : ");
		String Title = bufferedReader.readLine().trim();
		System.out.println("Please enter the author name : ");
		String Author = bufferedReader.readLine().trim();
		System.out.println("Please enter the price of book : ");
		int Price= Integer.parseInt(bufferedReader.readLine().trim());
		Day_13_sol days = new Day_13_sol(Title,Author, Price);
		days.display();
	}
}