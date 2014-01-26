
class A{

public void fun1(int x){

System.out.println("int in A");

}

public void fun1(int x,int y){

System.out.println("int and int");

}

}


class C extends A{

public void fun1(int x){

System.out.println("int in C");

}
}


public class D{

public static void main(String[] args){

A obj;


    obj= new A(); // line 1

obj.fun1(2);  // line 2 (prints "int in A")


    obj=new C();  // line 3

obj.fun1(2);  // line 4 (prints "int in C")

}

}