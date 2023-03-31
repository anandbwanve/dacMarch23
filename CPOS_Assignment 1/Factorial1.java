import java.util.*;

class Factorial {

   public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } 
        else {
        return n * calculateFactorial(n - 1);
        }
   }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int fact = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }

  