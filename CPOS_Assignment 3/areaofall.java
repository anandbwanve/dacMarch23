import java.util.*;
class areaofall{

  static Scanner sc = new Scanner(System.in);

	void circle(){
		System.out.println("Enter radius of the circle for area :");
		double radius = sc.nextDouble();
		double area = Math.PI*radius*radius;
		System.out.println("area of circle =" + area);
	}
	
	void square(){
		System.out.println("Enter side of the Square for area :");
		double side = sc.nextDouble();
		double area = side*side;
		System.out.println("area of square =" + area);
	}
	
	void triangle(){
		System.out.println("Enter base of the triangle for area :");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println("Enter height of the triangle for area :");
		double area = base*height/2;
		System.out.println("area of triangle =" + area);
	}
	
	void rectangle(){
		System.out.println("Enter length of the rectangle for area :");
		double length = sc.nextDouble();
        System.out.println("Enter breadth of the rectangle for area :");
		double breadth = sc.nextDouble();
		double area = 2*breadth*length;
		System.out.println("area of rectangle =" + area);
	}
		
	public static void main(String args[]){
		areaofall cal = new areaofall();
        System.out.println("Enter Shape for area(CASE SENSITIVE: circle, triangle, rectangle, square are allowed)");
        String Shape = sc.nextLine();
		switch(Shape){
            case "circle" : cal.circle();
            break;
            case "square" : cal.square();
            break;
            case "triangle" : cal.triangle();
            break;
            case "rectangle" : cal.rectangle();
            break;
            default :
               System.out.println(Shape + " is not a valid shape.");
            break;
        }
		
		
	
	}
}