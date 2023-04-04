import java.util.*;

class Day_7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of array : ");
		int N = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter the values of array : ");
		int[] numberArray = new int[N];
		for(int i=0;i<N;i++){
			numberArray[i] = sc.nextInt();
		}
		for(int i = numberArray.length-1;i>-1;i--){
				System.out.print(numberArray[i]+" ");
		}
		
	}
	
}