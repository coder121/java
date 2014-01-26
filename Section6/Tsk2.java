import java.io.*;
class Tsk2{
public static void main(String[] args)throws IOException{
int[][]n=new int[3][3];
DataInputStream dis=new DataInputStream(System.in);
for(int r=0;r<n.length;r++){
for(int c=0;c<n.length;c++){
if(r==1&&c==1){
n[1][1]=5;
continue;
}

System.out.println("Enter the elements in");
System.out.println("n"+"["+r+"]"+"["+c+"]");
n[r][c]=Integer.parseInt(dis.readLine());

}
}

for(int r=0;r<n.length;r++){
//int c=0;
if(n[r][c]+n[r][c+1]+n[r][c+2]==15){
System.out.println("Valid");
}
else{
System.out.println("Invalid");
}
}

/*
if(n[0][0]+n[0][1]+n[0][2]==15){
if(n[1][0]+n[1][1]+n[1][2]==15){
if(n[2][0]+n[2][1]+n[2][2]==15){
if(n[0][0]+n[1][0]+n[2][0]==15){
if(n[0][1]+n[1][1]+n[2][1]==15){
if(n[0][2]+n[1][2]+n[2][2]==15){
if(n[0][0]+n[1][1]+n[2][2]==15){
System.out.println("Valid");
}
}
}
}
}
}
}
else{
System.out.println("Invalid");
}*/

}

}