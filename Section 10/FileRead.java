import java.io.*;
public class FileRead{
public static void main(String args[]){
try{
     BufferedReader br=new BufferedReader(new FileReader("Tast.txt"));
	 BufferedWriter bw=new BufferedWriter(new FileWriter("info.txt"));
	 int c;
	 while((c=br.read())!=-1)
	     bw.write(c);
	 
	 br.close();
	 bw.close();
	


}catch(IOException e){}

}

}