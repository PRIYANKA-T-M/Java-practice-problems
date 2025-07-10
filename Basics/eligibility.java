import java.util.Scanner;
public class eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age to check eligibility:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible age for driving lisence");
		}
		else {
			System.out.println("Not an Eligible age for driving lisence");
		}

	}

}
