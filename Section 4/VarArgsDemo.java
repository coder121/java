class Student
{
public void semSubjects(String... subjects)
{
for(String sub : subjects)
System.out.println(sub);
System.out.println();
}
public void studentDetails(String name,int age,String... address)
{
System.out.print(name+"\t"+age+"\t");
for(String str : address)
System.out.print(str+" , ");
System.out.println();
}
}
class VarArgsDemo
{
public static void main(String args[])
{
Student
st = new Student();
st.semSubjects("Maths","Chemistry","Physics");
st.semSubjects("Java","CPP","Python","Perl","Ruby","DotNet");
st.studentDetails("Rahul", 26,"IIIT","Gachibowli","Hyderabad");
st.studentDetails("Rohit", 28,"Street 115","RK Nagar","Malakpet","Hyderabad");
st.studentDetails("Siddiq",21,"green masion");
}
} 