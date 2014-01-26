import java.io.*;
class Rectangle{

int len;
int brt;
public void setLength(int len){
this.len=len;

}

public void setBreadth(int brt){
this.brt=brt;
}

public void getLength(){
System.out.println("The Lenth is "+len);

}
public void getBreadth(){

System.out.println("The breadth is "+brt);
}
public void getArea(){
System.out.println("The area is "+len*brt);

}
public void getPeri(){

System.out.println("The perimeter is "+2*(len+brt));
}
}

public class Task2{
public static void main(String[] args) throws IOException{
Rectangle r=new Rectangle();
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the length of rectangle");
int len=Integer.parseInt(br.readLine());
r.setLength(len);
r.getLength();
System.out.println("Enter the breadth of rectangle");
String brtt=br.readLine();
int brt=Integer.parseInt(brtt);
r.setBreadth(brt);
r.getBreadth();
r.getArea();
r.getPeri();


}
}