import java.util.*;
public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter num:");
		int num=inp.nextInt();
		if(num%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}

}
