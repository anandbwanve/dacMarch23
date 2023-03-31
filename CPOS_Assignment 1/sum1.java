import java.util.*;
class sum1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		int a = add(num1, num2);
		
	}
	static int add(int a, int b) {
		if (a<b) {
		for(int i = 1; i <= b; i++) {
				a++;
		} 
		System.out.println(a);
		return a;
		} else {
			for(int i = 1; i <= a; i++) {
				b++;
			}
		System.out.println(b);
		return b;
		
		}
		
	}
}
