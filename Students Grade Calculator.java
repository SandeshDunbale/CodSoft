import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total_marks=0;
		System.out.println("Please Enter The Number Of Subjects:");
		int subjects=sc.nextInt();
		
			for(int i=1;i<=subjects;i++) {
				System.out.println("Enter Marks in Subject " + i + " out of 100:");
				int marks=sc.nextInt();
					if(marks < 0 || marks > 100) 
					{
						System.out.println("Invalid Input!Please Enter marks between 0 and 100!!");
						return;
					}
			total_marks += marks;
		}
			double avg_per=total_marks/subjects;
			String grade = calc_grade(avg_per);
			System.out.println("Total Marks:" + total_marks);
			System.out.println("Average Percentage:" + avg_per);
			System.out.println("Grade:" + grade);	
	}
			private static String calc_grade(double avg_per) {
				if(avg_per>90) {
					return "A+";
				}
				else if(avg_per>=80) {
					return "A";
				}
				else if(avg_per>=70) {
					return "B";
				}
				else if(avg_per>=60) {
					return "C";
				}
				else if(avg_per>=50) {
					return "D";
				}
				else {
					return "F";
				}
	}
	
}

