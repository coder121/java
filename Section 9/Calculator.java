import java.io.*;

class Calci{
public void Add(int a,int b){
System.out.println(a+b);
}
public void Sub(int a,int b){
System.out.println(a-b);
}
public void Mul(int a, int b){
System.out.println(a*b);
}
public void Div(int a,int b){
System.out.println(a/b);
}
}
public class Calculator {
public static void main(String args[]) throws IOException{
Calci c=new Calci();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try{
System.out.println("Enter First Number: ");
int a=Integer.parseInt(br.readLine());
System.out.println("Enter Second Number: ");
int b=Integer.parseInt(br.readLine());
System.out.println("Select one option 1.Addition \n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
int n=Integer.parseInt(br.readLine());
if(n==1){
c.Add(a,b);
}
else if(n==2){
c.Sub(a,b);
}
else if(n==3){
c.Mul(a,b);
}
else if(n==4){
c.Div(a,b);
}
else{
System.out.println("Hope to see you again");
}
}
catch (ArithmeticException ae){
System.out.println( "ArithmeticException ");
}
catch(NumberFormatException nfe){
System.out.println( "NumberFormatException");
}




}

}