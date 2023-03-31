import java.util.*;
class palindrome {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while (temp > 0){
			int reverse = temp %10;
			sum = (sum * 10) + reverse;
			temp = temp / 10;
		}
		if (num == sum){
			System.out.println("Palindrome number");
		}
		else{
			System.out.println("Not a palindrome number");
		}
		}
		}
