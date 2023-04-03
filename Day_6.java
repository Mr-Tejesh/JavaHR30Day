import java.io.*;

class Day_6{

	public static void main(String[] args) throws Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		String[] strArray = new String[n];
		//Creating a string array to read all the testcases before processing
		for(int i=0;i<n;i++){
				System.out.print("Please enter String :");
				strArray[i] = bufferedReader.readLine().trim();
		}
		
		for(int i=0;i<n;i++){
				String s = strArray[i];	//Fetching out single string
				System.out.println(s);	//This is a debug step to know on which string we are working now
				char[] stringArray = s.toCharArray();	//method to convert string to character array
				char[] even = new char[s.length()];		//even array stores evenly positioned characters
				char[] odd = new char[s.length()];		//odd array stores oddly positioned characters
				int eve=0,od=0;
				//The following for loop seperated the even and odd position characters and place them in their respective arrays
				for(int j=0;j<s.length();j++){
						if(j==0 || j%2==0){
							even[eve] = stringArray[j];
							eve+=1;
						}else{
							odd[od] = stringArray[j];
							od+=1;
						}
				}
				System.out.print(even);
				System.out.print(" ");
				System.out.println(odd);

				
		}
		
	}
	
}