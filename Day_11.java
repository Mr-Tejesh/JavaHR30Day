import java.util.*;
import java.io.*;

class Day_11{
	
		public static void main(String[] args) throws Exception{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Please enter number of rows and columns each on a new line : ");
				int rows = Integer.parseInt(bufferedReader.readLine().trim());
				int columns = Integer.parseInt(bufferedReader.readLine().trim());
				int[][] matrix = new int[rows][columns];
				System.out.println("Please enter numbers in 2D format");
				Scanner read = new Scanner(System.in);
				for(int i=0;i<rows;i++){
						for(int j=0;j<columns;j++){
									matrix[i][j] = read.nextInt();
						}
				}
				if(rows>2){
					int total,max=0;
					for(int i=0;i<rows-2;i++){
						for(int j=0;j<columns-2;j++){
							total = matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j+1]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+1];
							if(total>max){
								max = total;
							}
						}
					}
					System.out.println(max);
				}else{
					System.out.println("Hourglass is not available for the matrix which has rows less than 2");
				}
		}
}
	