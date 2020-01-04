package corejava;
import java.util.Scanner;
class Area
{
	public void findArea( int side) {
	System.out.println("Area of the Square is "+(side*side));//calcuiate area of square
}
	public void findArea( int length ,int breadth) {
		System.out.println("Area of the Rectangle is "+(length*breadth));//calcuiate area of Rectangle
		
	}
	public void findArea( float base ,float height) {
		System.out.println("Area of the Triangle is "+((base*height)/2));//calcuiate area of Triangle
	}
	public void findArea(float radius) {
		System.out.println("Area of the circle is "+((float)(3.14*radius*radius)));//calcuiate area of circle
		
	}
}
public class polymorphism1 {
	public static void main(String args[])
	{
		
	
	
		Area area=new Area();
		area.findArea(40);
		area.findArea(10,15);
		area.findArea(20.0f,30.0f);
		area.findArea(6.0f);
		
	}
}


