import java.io.*;
public class SearchString{
   public static void main(String[] args)throws IOException{
      InputStreamReader isr=new InputStreamReader(System.in);
	  BufferedReader br=new BufferedReader(isr);
	  System.out.println("Enter the string");
	  String str=br.readLine();
	  System.out.println("Enter the word that is needed to be searched");
	  String wrd=br.readLine();
	  int intIndex = str.indexOf(wrd);
      
      if(intIndex == - 1){
         System.out.println(" not found");
      }else{
         System.out.println("Found"+wrd+" at index "
         + intIndex);
      }
   }
}