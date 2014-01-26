 final class A {

private int type;

public int getType() {return type;}

}

public class Test11 {

public static void main(String args[])

{

int N = 5000000;

int i = N;

int t = 0;

A aref = new A();

while (i-- > 0)

t = aref.getType();

}

}
