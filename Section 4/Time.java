import java.io.*;

class Clock1{
int hour;
int min;
int sec;
String timePeriod;
String Am;
String Pm;

Clock1(){
hour=00;
min=00;
sec=00;
}
Clock1(int h,int m, int s){
hour=h;	
min=m;
sec=s;
}
public void setHour(int hour){
this.hour=hour;
}
public void setMin(int min){
this.min=min;
}
public void setSec(int sec){
this.sec=sec;
}
public int getHour(){
return hour;
}
public int getMin(){
return min;
}
public int getSec(){
return sec;
}


public void displayTime(){
if(hour<12){
System.out.println(hour+";"+min+":"+sec+":"+"Am");
}
else {
System.out.println(hour+";"+min+":"+sec+":"+"PM");
}
}
//public void timePeriod(String Am,String Pm){
//this.Am=Am;
//this.Pm=Pm;
//}
public void displayMSg(){
if(hour<7 ){
System.out.println("Its Late Night!Go to Sleep");
}
else if(hour>5 && hour <13){
System.out.println("Good Morning");
}
else if(hour>12 && hour <18){
System.out.println("Good Afternoon");
}
else if(hour>17 && hour <20){
System.out.println("Good Evening");
}
else{
System.out.println("Good Night");
}
}
}



public class Time{

public static void main(String[] args) throws IOException{

Clock1 cC1,cC2;
cC1=new Clock1();
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the time");
System.out.println("Enter hours");
int hour=Integer.parseInt(br.readLine());
System.out.println("Enter mins");
int min=Integer.parseInt(br.readLine());
System.out.println("Enter seconds");
int sec=Integer.parseInt(br.readLine());
//System.out.println("Enter the timeperiod(Am or Pm)");
//String timePeriod=br.readLine();
cC2=new Clock1(hour,min,sec);
cC1.displayTime();
cC2.displayTime();
cC2.getHour();
cC2.getMin();
cC2.getSec();

cC2.displayMSg();
}
}
