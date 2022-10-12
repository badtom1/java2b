package AreaCalc;
import shape.*;
import java.util.*;

public class AreaCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s = new square();
		triangle t = new triangle();
		circle c = new circle();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("\n1.Area of sqaure \n2.Area of triangle \n3.Area of circle \n4.Exit");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("Enter the length of square:");
				float a= sc.nextFloat();
				float res=s.area(a);
				System.out.println("Area of sqaure is :"+res);
				System.out.println("*****************************");
				
				
			}
			if(ch==2) {
				System.out.println("Enter the height of triangle:");
				float a= sc.nextFloat();
				System.out.println("Enter the base of triangle:");
				float b= sc.nextFloat();
				float res=t.area(a,b);
				System.out.println("Area of triangle is :"+res);
				System.out.println("*****************************");
				
				
			}
			if(ch==3) {
				System.out.println("Enter the radius of circle:");
				float r= sc.nextFloat();
				float res=s.area(r);
				System.out.println("Area of circle is :"+res);
				System.out.println("*****************************");
				
			}
			
			else if(ch==4) {
				break;
			}
	
		}
		

	}

}
