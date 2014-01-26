
class Student{

String name;

int age=30;

public void setName(String name){

this.name=name;

}

public void getName(){

System.out.println(name);

}

}

public class StudentDriver{

public static void main(String[] args){

Student s=new Student();

String name; //Lets assume name is read from the user

s.setName(name);

s.getName();

}

}