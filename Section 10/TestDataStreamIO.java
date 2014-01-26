import java.io.*;
public class TestDataStreamIO{
public static void main(String[] args){
int noOfStudents = 3;
int[] rolls1 = { 1, 2, 3 }, rolls2 = new int[3];
String[] names1 = { "John", "Alex", "Kane" }, names2 = new String[3];
double[] grades1 = { 7.5, 5.9, 6.2 }, grades2 = new double[3];
try
{

// Write out into the file.
DataOutputStream dos = new DataOutputStream(new FileOutputStream("Tast.txt"));
dos.writeInt(noOfStudents);  dos.writeChar('\n');
for (int i = 0; i < noOfStudents; i++)
{
dos.writeInt(rolls1[i]);  dos.writeChar('\t');
dos.writeUTF(names1[i]);  dos.writeChar('\t');
dos.writeDouble(grades1[i]);  dos.writeChar('\n');
}
dos.close();
// read back in again
DataInputStream dis = new DataInputStream(new FileInputStream("Tast.txt"));
noOfStudents = dis.readInt();dis.readChar();
for (int i = 0; i < noOfStudents; i++)
{
rolls2[i] = dis.readInt(); dis.readChar();
names2[i] = dis.readUTF(); dis.readChar();
grades2[i] = dis.readDouble(); dis.readChar();
System.out.println(rolls2[i]+" "+names2[i]+" "+grades2[i]);
}
dis.close();
}
catch (FileNotFoundException e)
{
// read back in again
DataInputStream dis = new DataInputStream(new FileInputStream("Tast.txt"));
noOfStudents = dis.readInt();dis.readChar();
for (int i = 0; i < noOfStudents; i++)
{
rolls2[i] = dis.readInt(); dis.readChar();
names2[i] = dis.readUTF(); dis.readChar();
grades2[i] = dis.readDouble(); dis.readChar();
System.out.println(rolls2[i]+" "+names2[i]+" "+grades2[i]);
}
dis.close();
}
catch (FileNotFoundException e)
{
System.out.println(e.getMessage());
}
catch (IOException e)
{
System.out.println(e.getMessage());
}
}
}

