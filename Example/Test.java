import java.io.*;
import java.util.*;
class Test{
public static void main(String args[])throws IOException{

Scanner scanner =new Scanner(System.in);

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of items");
int n=scanner.nextInt();
int []a=new int[n];
System.out.println("Enter the rates");
for (int i=0;i<n;i++){
a[i]=scanner.nextInt(); 
}
int sum=0;
 for(int i=0;i<n;i++){
  sum=sum+a[i] ;
  System.out.println(sum);

}

}

}