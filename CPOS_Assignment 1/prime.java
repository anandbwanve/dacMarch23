import java.util.Scanner;
class prime {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int c =2;
		while (num > 1){
			if(num % c == 0){
				System.out.println("Factors are" + c);
				num = num /c ;
			}
			else {
				c++;
			}
		}
	}
}