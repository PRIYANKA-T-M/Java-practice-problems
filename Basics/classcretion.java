package newapp;
import java.util.*;
class printing{
	public int number;
	public void display() {
		System.out.println("Number="+number);
	}
};

public class classcretion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		printing obj=new printing();
		obj.number=20;
		obj.display();
		obj.number=400;
		int num=sc.nextInt();
		obj.number=num;
		obj.display();

	}

}
//