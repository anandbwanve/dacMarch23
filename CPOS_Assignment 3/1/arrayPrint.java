import java.util.*;
class arrayPrint{
	
	public static void main(String args[]){
/*		int a[]= new int[3];
		a[0]=4;
		a[1]=5;
		a[2]=6;
		int b[]={1,2,3};
		
		System.out.println("Array a is:");
		for(int i=0; i<a.length; i++){
		System.out.println(a[i]);
		}
		
		System.out.println("Array b is:");
		for(int i=0; i<b.length; i++){
		System.out.println(b[i]);
		}
*/

    		Scanner sc = new Scanner(System.in);
			int a[] = new int[3];
			System.out.println("enter 3 integers");
			
		for(int i=0; i<a.length; i++){
				a[i]= sc.nextInt();
			}

			
			
/*		System.out.println("Array a is:");
		for(int i=0; i<a.length; i++){
		System.out.println(a[i]);
		}
*/

		for(int i : a){
			System.out.println("Array element" + i);
		}
	}
	
}
