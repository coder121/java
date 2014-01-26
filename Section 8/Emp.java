import java.io.*;
class Employee{
String name;
int age;

int sal;
int hrs;
public void setSalary(int sal){
this.sal=sal;
}
public void setDetails(String name,int age,int hrs){
this.name=name;

this.age=age;
this.hrs=hrs;
}
public void getFsalary(){

double fsal=sal+hrs*150;
System.out.println("Salary of full time employee is :"+fsal);
}
public void getPsalary(){
double psal=hrs*50;

System.out.println("Salary of part time employee is :"+psal);
}
}
public class Emp{
public static void main(String args[])throws IOException{
Employee em=new Employee();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to Software Solutions");
System.out.println("Please enter your details");
System.out.println("Enter your name");
String  name=br.readLine();
System.out.println("Enter you age");
int age=Integer.parseInt(br.readLine());
System.out.println("Enter the number of hours worked");
int hrs=Integer.parseInt(br.readLine());
em.setDetails(name,age,hrs);

System.out.println("Please select your designation 1.Full-Time\n 2.Part-Time");
int n=Integer.parseInt(br.readLine());
if(n==1){
System.out.println("Enter the salary");
int sal=Integer.parseInt(br.readLine());
em.setSalary(sal);
em.getFsalary();
}
if(n==2){
em.getPsalary();
}
else{
System.out.println("Have a nice day");
}





}

}