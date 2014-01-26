import java.io.*;
public class stringBuffer{
public static void main(String[] args) throws IOException{
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

String str;

try{

System.out.print("Enter your name: ");

str = in.readLine();

str += ", This is the example of SringBuffer class and it's functions.";

//Create a object of StringBuffer class

StringBuffer strbuf = new StringBuffer();

strbuf.append(str);

System.out.println(strbuf);

strbuf.delete(0,str.length());


    //append()

strbuf.append("Hello");

strbuf.append("World");              //print HelloWorld

System.out.println(strbuf);


    //insert()

strbuf.insert(5,"_Java ");            //print Hello_Java World

System.out.println(strbuf);
    //reverse()

strbuf.reverse();

System.out.print("Reversed string : ");

System.out.println(strbuf);            //print dlroW avaJ_olleH

strbuf.reverse();

System.out.println(strbuf);            //print Hello_Java World


    //setCharAt()

strbuf.setCharAt(5,' ');

System.out.println(strbuf);            //print Hello Java World


    //charAt()

System.out.print("Character at 6th position : ");

System.out.println(strbuf.charAt(6));      //print J


    //substring()

System.out.print("Substring from position 3 to 6 : ");

System.out.println(strbuf.substring(3,7));    //print lo J


    //deleteCharAt()

strbuf.deleteCharAt(3);

System.out.println(strbuf);            //print Helo Java World
   //capacity()

System.out.print("Capacity of StringBuffer object : ");

System.out.println(strbuf.capacity());      //print 67


    //delete() and length()

strbuf.delete(6,strbuf.length());

System.out.println(strbuf);            //Helo J

}

catch(StringIndexOutOfBoundsException e){

System.out.println(e.getMessage());

}

}

}