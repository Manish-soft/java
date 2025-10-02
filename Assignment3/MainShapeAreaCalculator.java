//super class

abstract class shape{
   abstract double area();
   
   }
    //sub class
	class Rectangle extends shape{
	 double length;
	 double breadth;
	 
	 Rectangle(double length, double breadth){
	 
	 this.length=length;
	 this.breadth=breadth;
	 }
	 @Override
	 double area(){
	  return length * breadth;
	  
	  }
	 }
	 
	 // subclass circle
	 class circle extends shape{
	  double radius;


        circle(double radius){
		this.radius=radius;
		
		}		
	     @Override
		 double area(){
		  return Math.round(Math.PI * radius * radius * 100.0) / 100.0; 
	 
	 
	 }
	 }
	 class MainShapeAreaCalculator{
	 public static  void main(String [] agrs){
	 
	 Rectangle r1 = new Rectangle(5, 10);
        circle c1 = new circle(7);

        System.out.println("Rectangle Area = " + r1.area());
        System.out.println("Circle Area = " + c1.area());
	 
	 
	 
	 
	 }
	 
	 
	 }
	
	
	
	
	
