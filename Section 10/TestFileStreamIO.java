import java.io.*;


public class TestFileStreamIO
{
public static void main(String[] args)
{
FileInputStream fis = null;
FileOutputStream fos = null;
try

{
fis = new FileInputStream("Tast.txt");
fos = new FileOutputStream("Tast_copy.txt");
int ch;
while( (ch = fis.read()) != -1)
fos.write(ch);
fis.close();
fos.close();
}
catch (FileNotFoundException e)
{
System.out.println("Error: Unable to find the file specified!");
}
catch (IOException e)
{
System.out.println("Error: Unable to perform read/write operation!");
}
}
}