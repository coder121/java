import java.io.*;
class FFile{
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the file name");
String s=br.readLine();
File f=new File(s);
if(f.exist()){
System.out.println("File existed");
}
else{
System.out.println("File not found");

}
}
}


 