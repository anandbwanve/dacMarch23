import java.util.Scanner;
class EvenSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter maximum number");
    int max = sc.nextInt();
    for (int i = 1; i <= max; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}