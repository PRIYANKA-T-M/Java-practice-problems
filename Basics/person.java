package newapp;
import java.util.*;
class Person2{
	public String name;
	public int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void display() {
		System.out.println("Name="+name+"Age="+age);
	}
};
public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		Person2 p1=new Person2();
		p1.name=name;
		p1.age=age;
		System.out.println("By method getName: "+p1.getName());
		System.out.println("By method getAge"+p1.getAge());
		p1.display();
		
		
		
		
		

	}

}
/* define a class name person with name and age.The name is string and age is integer. Implement the getter methods getName() &getage() reteuns the prints if the attributes
create a method display to display the person's name
create the instance of the class person */