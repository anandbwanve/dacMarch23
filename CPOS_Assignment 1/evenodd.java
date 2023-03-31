import java.util.*;
class evenodd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		String result = (num % 2 == 0)? "even" : "odd";
		System.out.println("Number is" + result);
	}
}