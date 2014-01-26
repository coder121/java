import java.io.*;

class Tsk1{

public static void main(String[] args)throws IOException{
int[]n=new int[10];
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter the numbers");
for(int i=0;i<10;i++){
n[i]=Integer.parseInt(dis.readLine());
}
int max=n[0];
for(int i=1;i<10;i++){
if(n[i]>max){
max=n[i];

}

}
System.out.println("The max is "+max);
int min=n[0];
for(int i=1;i<10;i++){
if(n[i]<min){
min=n[i];


}


}
System.out.println("The min is "+min);





}
}