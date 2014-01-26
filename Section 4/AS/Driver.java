import java.io.*;
public class Driver{
public static void main(String[] args) throws IOException{
Company c=new Company();
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the year of Estalishment");
int yearOfEstablishment=Integer.parseInt(br.readLine());
System.out.println("Enter the annualturnover");
double annualTurnover=Double.parseDouble(br.readLine());
System.out.println("Enter the annual sales");
double annualSales=Double.parseDouble(br.readLine());
c.setTurnover(annualTurnover);
c.setannualSales(annualSales);
c.profit();
 


}
}