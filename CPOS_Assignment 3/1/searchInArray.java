import java.util.Scanner;
class searchInArray{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a [] ={1,2,3,4,5};
	System.out.println("enter the number you want to search");
	int b = sc.nextInt();
	
	for(int i=0; i<a.length; i++){
	if(b==a[i]){
		System.out.println("your number is at " + a[i]);
	}
	}
}
}

