import java.util.*;
class areacircle{
	Scanner sc  = new Scanner(System.in);
	double r = sc.nextDouble();

	double pi = 3.14;
	
	
	void display(){
		double area= 2*pi*r*r;
		System.out.println("area of circle =" + area);
	}
	
	public static void main (String args[]){
		areacircle a1 = new areacircle();
		
		a1.display();
	}
}