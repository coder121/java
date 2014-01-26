import java.io.*;

class Clock1{
int hour;
int min;
int sec;
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
public void getHour(){
return Hour;
}
public void getMin(){
return min;
}
public void getSec(){
return sec;
}
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

public int displayTime(){
if(timePeriod==Am){
System.out.println(hour+";"+min+":"+sec+":"+"Am");
}
else{
System.out.println(hour+";"+min+":"+sec+":"+"Pm");
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



public class Clock1{

public static void main(String[] args) throws IOException{

Clock1 cC1,cC2;
cC1=new Clock1();
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
cC2.displayTime();
cC2.getHour();
cC2.getMin();
cC2.getSec();
cC2.timePeriod();
cC2.displayMsg();
}
}
