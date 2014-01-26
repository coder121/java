import java.io.*;
class StrBuf{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String str=br.readLine();
String[] a=str.split(" ");
int len=a.length;
System.out.println("Select your opperation you want to perform on string\n 1. Convert sentence to uppercase\n2. Convert sentence to lowercase\n3. Display each word in the sentence\n4. Search for a word in the sentence\n5. Replace space with $ symbol in the sentence");
int i=Integer.parseInt(br.readLine());
if(i==1){
String u;
u=str.toUpperCase();
System.out.println(u);
}
if(i==2){
String l;
l=str.toLowerCase();
System.out.println(l);
}
if(i==3){
for(int j=0;j<len;j++){

System.out.println(a[j]);
}
}
if(i==4){
System.out.println("Enter the word you want to search in the string");
String wrd=br.readLine();
int inx=str.indexOf(wrd);
if(inx==-1){
System.out.println("word now found");
}
else{
System.out.println("found at index"+inx);
}

}
if(i==5){
for(int j=0;j<=len;j++){
System.out.println(a[j]);
}
}
else{
System.out.println("have a nice day");

}


}

}