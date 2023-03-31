import java.util.*;
class star3{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of iterations: ");
            int n = sc.nextInt();
        
        for(int i=n; i>=1; i--){

            for(int j=1 ;j<=n;j++){

                if(j==1 || i==j || i==n)
                System.out.print("*");
                 else
                 System.out.print(" ");

            }
            System.out.println();
        }
    }
}

