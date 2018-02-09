/* ANA numbers are special numbers that hold certain ANA properties. 
 * This program helps find if an number is an ANA number (note that ANA is 
 * defined as "A Number that's ANA" - similar to GNU is defined as GNUs Not Unix...)
 */

//Import statements are like C++ #include statements
import java.io.IOException;
import java.util.Scanner;

public class ANA {
	int reverse(int org_num) {
		int rev_num = 0;
		int temp = 0;

		while(org_num > 0) {
			temp = org_num % 10;
			rev_num = (rev_num * 10) + temp;
			org_num = org_num/10;
		}

		return rev_num; 
	}


	void rev_and_sum(int number) {
		int reverse_num = reverse(number);
		int sum = reverse_num + number;
		int rev_sum = reverse(sum);

		if(sum == rev_sum) {
			System.out.println(number+" is an ANA number.");			
		}
		else {
			System.out.println(number+" is an not ANA number.");
		}
	}

	
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter number: ");

		try {
			int input = sc.nextInt();
			ANA obj = new ANA();
			obj.rev_and_sum(input);

		}
		catch(Exception e) {
			System.out.println("Please enter numbers only.");

		}

	}

}
