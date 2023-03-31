import java.util.*;

class leapyr {
    public static String calculate(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    return "leap";
                } else {
                    return "not leap";
                }
            } else {
                return "leap";
            }
        } else {
            return "not leap";
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int num = sc.nextInt();
        String ans = calculate(num);
        System.out.println("Year is " + ans);
    }
}
