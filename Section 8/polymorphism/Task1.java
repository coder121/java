class Animal{
String legs;
String eyes;
String fur;
public void walk(String legs){
System.out.println("Walking");
}
public void watch(String eyes){
System.out.println("sleeping");
}
}
class Vet{
public void shot(){
System.out.println("Vaccinating");
}
}
class Dog extends Animal{
public void makeNoise(){
System.out.println("Bow Bow");
}
}
class Cat extends Animal{
public void makeNoise(){
System.out.println("Meow Meow");
}
}
class Monkey extends Animal{
public void makeNoise(){
System.out.println("oh ah ah ah");
}
}
class Lion extends Animal{
public void makeNoise(){
System.out.println("Rawrrrrr");
}
}
public class Task1{
public static void main(String args[]){

Cat c=new Cat();
c.makeNoise();


}
}



