import java.io.*;

class Saheba{
public static void main(String args[])throws IOException{



BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true) {
System.out.println("WELCOME TO SAHEBA SUITS AND SAREES");
System.out.println("Please select an option \n1.Find Total \n 2.Find Discount\n 3.Exit");
int op=Integer.parseInt(br.readLine());
if(op==1){
System.out.println("Enter the number of items");
int n=Integer.parseInt(br.readLine());
int []a=new int[n];
System.out.println("Enter the rates");
for (int i=0;i<n;i++){
a[i]=Integer.parseInt(br.readLine()); 
}
int sum=0;
 for(int i=0;i<n;i++){
  sum=sum+a[i] ;
  }
System.out.println("The total of  "+n+" items is Rs"+sum);
System.out.println("Enter the amount");
int m=Integer.parseInt(br.readLine());
int dif=m-sum;
System.out.println("The change to be given back is Rs"+dif);
}
else if(op==2){
System.out.println("Enter the price or total");
double pr=Integer.parseInt(br.readLine());
System.out.println("Enter the discount %");
int disc=Integer.parseInt(br.readLine());
double dis=pr*disc/100;
 double sum=pr-dis;
System.out.println("The discount of "+pr+" with "+disc+" is "+sum);

}
else{
System.out.println("HAVE A NICE DAY");
return;
}
}
}
}