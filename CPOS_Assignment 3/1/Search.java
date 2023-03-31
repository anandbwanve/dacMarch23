import java.util.Scanner;
public class Search
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int s = sc.nextInt();
		int a[] = new int[s];
		
		System.out.println("enter the elements of array: ");
		for(int i=0; i<s; i++) {
			a[i]= sc.nextInt();
			
		}
		
			System.out.println("enter the number to search: ");
			int c = sc.nextInt();
			for(int i=0; i<s;i++){
				if(a[i] == c){
					System.out.println("the number is at: " + (i+1));
				}
			}
		
       
	}
}

