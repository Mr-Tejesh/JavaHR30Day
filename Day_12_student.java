import java.util.*;

class Day_12_student extends Day_12_person {
	public static String firstName;
	public static String lastName;
	public static int identification;
	public static int[] marks;

	Day_12_student(String firstName, String lastName, int identification, int[] marks) {
		super(firstName, lastName, identification);
		this.marks = marks;
	}

	public char calculate(){
			int sum=0;
			for(int i=0;i<marks.length;i++){
					sum+=marks[i];
			}int avg=sum/marks.length;
			if(avg>=90 && avg<=100){
					return 'O';
			}else if(avg>=80 && avg<90){
					return 'E';
			}else if(avg>=70 && avg<80){
					return 'A';
			}else if(avg>=55 && avg<70){
					return 'P';
			}else if(avg>=40 && avg<55){
					return 'D';
			}else if(avg<40){
					return 'T';
			}else{
					return 'Z';
			}
	}

	public static void main(String[] args) {
		String firstName = "Heraldo";
		String lastName = "Memelli";
		int idNumber = 2;
		int[] marks = { 100, 80 };
		Day_12_student stds = new Day_12_student(firstName, lastName, idNumber, marks);
		System.out.println(stds.calculate());
	}
}