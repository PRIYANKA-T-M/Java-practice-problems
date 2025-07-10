import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 sub marks:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int m6=sc.nextInt();
		int avg=(m1+m2+m3+m4+m5+m6)/6;
		System.out.println("Average="+avg);
		
		

	}

}
