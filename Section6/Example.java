import java.util.*;
import java.io.*;
public class Example{
public static void main(String[] arge) throws IOException{
int[] a=new int[10];
DataInputStream dis=new DataInputStream(System.in);
for(int i=0;i<10;i++){
System.out.println("Enter the elements");
a[i]=Integer.parseInt(dis.readLine());
}
System.out.println("Element in ascending order are");
Arrays.sort(a);
for(int i=0;i<10;i++){
System.out.println(" "+a[i]);

}
}
}


