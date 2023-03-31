import java.util.*;
class plusminus{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	String result = (num>0) ? "Number is positive." : (num < 0) ? "Number is negative." : "Number is zero.";
	System.out.println(result);
}
}