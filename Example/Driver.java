import java.io.*;
import solids.*;

public class Driver{
int n;
public static void main(String[] args)throws IOException{
System.out.println("1. Cube\n2. Cuboid\n3. Sphere\n4. Cylinder\n5. Exit");
System.out.println("Enter your choice ");
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int n=Integer.parseInt(br.readLine());
if(n==1){
		System.out.println("enter the parameter for side");
		double s=Double.parseDouble(br.readLine());
		Cube cb=new Cube();
		cb.printCube(s);
		}
		else if(n==2){
			System.out.println("enter the parameter for length");
		double l=Double.parseDouble(br.readLine());
			System.out.println("enter the parameter for breadth");
		double b=Double.parseDouble(br.readLine());
			System.out.println("enter the parameter for height");
		double h=Double.parseDouble(br.readLine());
          Cuboid cbd=new Cuboid();
		cbd.printCuboid(l,b,h);
		}
		else if(n==3){
        System.out.println("enter the parameter for radius");
		double r=Double.parseDouble(br.readLine());
		Sphere s=new Sphere();
		s.printSphere(r);
		
		}
        else if(n==4){
        System.out.println("enter the parameter for radius");
		double r=Double.parseDouble(br.readLine());
		System.out.println("enter the parameter for height");
		double h=Double.parseDouble(br.readLine());
		Cylinder c=new Cylinder();
		c.printCylinder(r,h);
		
		}
		else{
		
		System.out.println("hope to see you again!!");
}
}
}