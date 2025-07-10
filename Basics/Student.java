import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter roll no:");
		int rollno=inp.nextInt();
		inp.nextLine();
		System.out.print("Enter name:");
		String name=inp.nextLine();
		System.out.print("Enter branch:");
		String branch=inp.nextLine();
		System.out.println("Roll no:"+rollno+"\nName:"+name+"\nBranch:"+branch);
		
		
	}

}
