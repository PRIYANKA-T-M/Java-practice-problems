package newapp;

public class loop {

	public static void main(String[] args) {
		//for loop 
		for(int i=0;i<=10;i++) {
			System.out.print (i+" ");
		}
		//while loop
		int j=0;
		while(j<=10) {
			System.out.print(j+" ");
			j++;
		}
		//printing even no.
		for(int i=50;i<=100;i++) {
			System.out.print((i%2==0)?i:" ");
			}
		//printing odd no.
		for(int i=50;i<=100;i++) {
			if(i%2!=0)
			System.out.print(i+" ");
			}
		
	}

};
