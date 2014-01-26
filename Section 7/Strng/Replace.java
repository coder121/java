package Strng;
public class Replace{
public static void repBy(String str){
String[] ab=str.split(" ");
for (int i=0;i<ab.length;i++){
System.out.print(ab[i]+"$");

}

}
}