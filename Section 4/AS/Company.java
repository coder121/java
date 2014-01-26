class Company{
int yearOfEstablishment;
 double annualTurnover;
 double annualSales;
double profit;
public void setYear(int yearOfEstablishment){
this.yearOfEstablishment=yearOfEstablishment;
}
public void setTurnover(double annualTurnover){
this.annualTurnover=annualTurnover;
}
public void setannualSales(double annualSales){
this.annualSales=annualSales;
}
public void profit(){

if(annualTurnover/annualSales>1)
{
System.out.println("High");
}
else if(annualTurnover/annualSales<0.5)
{
System.out.println("low");
}
else if(annualTurnover/annualSales<1 & annualTurnover/annualSales>0.5)
{
System.out.println("medium");
}
}}