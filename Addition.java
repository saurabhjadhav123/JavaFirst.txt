import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int no1, no2;
		int result;
		char char1='A';
		char char2='B';
		String cresult;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no1");
		no1 = sc.nextInt();
		System.out.println("enter no2");
		no2 = sc.nextInt();
		result = no1 + no2;
		System.out.println("Addition =" + result);
		
		
	    cresult = Character.toString(char1) + Character.toString(char2) ;
		System.out.println("character addition is ="+ cresult);
		
		
		

	}

}
