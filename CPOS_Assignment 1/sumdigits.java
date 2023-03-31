import java.util.Scanner;
class sumdigits{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println(total(num));
	}
	
	static int total(int n){
		int sum = 0;
		while (n != 0){
			sum = sum +(n%10);
			n = n/10;			
		}
		return sum;
	}
}