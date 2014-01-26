package Strng;
import java.io.*;
public class Search{
public void stringSearch(String str)throws IOException{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the word to be searched");
String wrd=br.readLine();
int index=str.indexOf(wrd);
if(index==-1)
{
System.out.println("not found");
}
else{
System.out.println("found at index"+index);
}
}
}