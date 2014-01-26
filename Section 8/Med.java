abstract class Medicine{
String name;
String addr;
public void getSet(String name,String addr){
this.name=name;
this.addr=addr;
}
public void Label(){
System.out.println(name);
System.out.println(addr);
}
}
class Syrup extends Medicine{
public void Label(){
super.Label();
System.out.println("Store in cool place");

}
}
class Med{
public static void main(String args[]){

Syrup sy=new Syrup();
sy.getSet("kadvidawa","tapachabutra");
sy.Label();

}
}
