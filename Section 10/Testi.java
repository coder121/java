import java.io.File;
import java.io.*;
public class Testi{
public static boolean FileExist(String Filename){
boolean exists=new File(Filename).exists();
return exists;
}
public static int test(String Filename){
if(FileExist(Filename)){
System.out.println("exists");

}
else
{
System.out.println("Does not exist");
}
}
public static void main(String args[])throws IOException{
BufferedReader br=new BfferedReader(new InputStreamReader(System.in));
System.out.println("Enter the name");
String fil=br.readLine();
if(isFile(fil)){
return File;
}
else{
System.out.println(Directory);
test(fil);
System.out.println(Filename.getAbsolutePath( ));
}
}

}