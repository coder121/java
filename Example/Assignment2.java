 import java.util.Scanner;  

public class Assignment2 {
  public static void main (String[] args) {
  System.out.println("this is an example");

 Scanner scan = new Scanner(System.in);

 double num = scan.nextInt();

 double total = 0;

 if(num < 0)
 {
     total += scan.nextDouble();
 }

 System.out.println(total);
     scan.close();

     }}