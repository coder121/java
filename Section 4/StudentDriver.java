import java.io.*;
class Student{

String name;

int age=30;

public void setName(String name){

this.name=name;

}

public void getName(){

System.out.println("The driver name is " +name);

}

}

public class StudentDriver{



Student s=new Student();
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the name");


String name=br.readLine(); //Lets assume name is read from the user

s.setName(name);
s.getName();

}

}