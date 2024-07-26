package Day1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Name:");
		String name=sc.nextLine();
		System.out.println("Enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Name is:"+name);
		System.out.println("The Addition is:"+(a+b));

	}

}
