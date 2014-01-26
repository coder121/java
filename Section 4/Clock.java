import java.io.*;
class Clock{
int hour;
int min;
int sec;
String Am;
String Pm;

String timePeriod;

public void setHour(int hour){
this.hour=hour;
}
public void setMin(int min){
this.min=min;
}
public void setSec(int sec){
this.sec=sec;
}
public int getHour(int hour){
return hour;
}
public int getMin(int min){
return min;
}
public int getSec(int sec){
return sec;
}
void Clock1(){
hour=00;
min=00;
sec=00;
}
void Clock1(int h,int m, int s){
hour=h;	
min=m;
sec=s;
}
void displayTime(){
if(timePeriod==Am){
System.out.println(hour+":"+min+":"+sec+":AM");
}
else{
System.out.println(hour+":"+min+":"+sec+":PM");
}
}
public void timePeriod(String Am,String Pm){
this.Am=Am;
this.Pm=Pm;
}
public void displayMSg(){
if(hour<7 &timePeriod==Am){
System.out.println("Its Late Night!Go to Sleep");
}
else if(hour>5 &hour <12 & timePeriod==Am){
System.out.println("Good Morning");
}
else if(hour>5 & timePeriod==Pm){
System.out.println("Good Afternoon");
}
else if(hour>5 & hour <9 & timePeriod==Pm){
System.out.println("Good Evening");
}
else{
System.out.println("Good Night");
}
}
}
public class Clocks{
public static void main(String[] args) throws IOException{

Clock ck=new Clock();

InputStreamreader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the time");
System.out.println("Enter hours");
int hour=Integer.parseInt(br.readLine());
System.out.println("Enter mins");
int min=Integer.parseInt(br.readLine());
System.out.println("Enter seconds");
int sec=Integer.parseInt(br.readLine());
System.out.println("Enter the timeperiod(Am or Pm)");
String timePeriod=br.readLine();
ck.displayTime();
ck.getHour(hour);
ck.getMin(min);
ck.getSec(sec);
//ck.timePeriod(Am,Pm);
ck.displayMsg();
}
}
