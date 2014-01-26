import java.io.*;
import Strng.*;
public class Task2{
public static void main(String args[])throws IOException{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the the string");
String str=br.readLine();
while(true){
System.out.println("Select the operations you want to perform on the string\n.1. Convert sentence to uppercase\n.2 Convert sentence to lowercase\n.3 Display each word in the sentence\n4. Search for a word in the sentence\n5. Replace space with $ symbol in the sentence\n6.Exit");
int n=Integer.parseInt(br.readLine());
if(n==1){
UC u=new UC();
u.upperCase(str);
}
if(n==2){
LC l=new LC();
l.lowerCase(str);
}
if(n==3){
DS d=new DS();
d.Display(str);
}
if(n==4){
Search ss=new Search();
ss.stringSearch(str);

}
else if(n==5){
Replace r=new Replace();
r.repBy(str);
}
else{
System.out.println("hope to see you again");
return;
}
}
}
}