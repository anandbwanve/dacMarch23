import java.util.*;
class star1{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of iterations: ");
            int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }



            System.out.println();
        }
    }
}

