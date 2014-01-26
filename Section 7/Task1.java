import java.io.*;
class Task1{
public static void main(String args[]) throws IOException{


InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the string ");
String str=br.readLine();
int len=str.length();
String[] ab=str.split(" ");

for(int i=ab.length-1;i>=0;i--){

System.out.print(ab[i]+" ");
}
}
}