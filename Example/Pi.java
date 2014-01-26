class Pi{

int m1()

{

System.out.println("I am in parent class");

}

}


class childoverride extends Pi{
public String m1()

{

return "I am in child class";

}

public static int main(String[] args)

{
Pi  pc = new Pi();

pc.m1();

childoverride c =new childoverride();

System.out.println(c.m1()); // Method Overriding

}

};