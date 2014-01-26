import java.io.*;
class  NegativePagesException extends Exception{
int pg;

public  NegativePagesException(int pg){
this.pg=pg;
}
public String toString(){
return "page number cannot be negative";
}
}
class NegativePriceException extends Exception{
int pr;
public NegativePriceException(int pr){
this.pr=pr;
}
public String toString(){
return "price cannot be negative";
}
}
class  Textbook{
public static void  main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter textbook title");
String ttl=br.readLine();
System.out.println("Enter authors name");
String aut=br.readLine();
System.out.println("Enter number of pages");
int pg=Integer.parseInt(br.readLine());
if(pg<0){
throw new NegativePagesException(pg);
}
System.out.println("Enter price");
int pr=Integer.parseInt(br.readLine());
if(pr<0){
throw new NegativePriceException(pr);
}
}

}