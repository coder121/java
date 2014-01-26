import java.io.File;
import java.io.*;
public class FileTest {
   public static boolean isFileExists(String filename) {
       boolean exists = new File(filename).exists();
       return exists;
   }
   public static void test(String filename) {
       
           if(isFileExists(filename) ){
		   System.out.println("The file exist");
		   
		   }
		   else{

		   System.out.println("does  not exists.");
		   }
      
   }
   
   public static void main(String args[]) throws IOException {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the file name to be searched");
   String fil=br.readLine();
        test(fil);
      
   }
}