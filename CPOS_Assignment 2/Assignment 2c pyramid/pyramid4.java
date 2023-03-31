import java.util.*;
class pyramid4{
    public static void main(String args[]){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of iterations");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int k=2*(n-i);k>0;k--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
            System.out.print(j + " ");

            }

            
          

            for(int j=i-1;j>=1;j--){
            System.out.print(j + " ");

            }


            System.out.println();
        }
    }
}