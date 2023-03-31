import java.util.*;
class lcm{
	public static void main(String args[]){
		int num1, num2, max, increase, lcmis =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		
		if(num1 > num2){
			max = increase = num1;
		}
		else {
			max = increase = num2;
		}
		
		while(num1 != 0 && num2 != 0){
			if(max% num1 == 0 && max %num2 == 0){
				lcmis = max;
				break;
			}
			
			max += increase;
		}
		System.out.println("LCM is " + lcmis );
	}
}