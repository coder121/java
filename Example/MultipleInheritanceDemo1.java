interface CanFight{
void fight();
}
interface CanSwim {
void swim();
}
interface CanFly {
void fly();
}
class HasPowers
{

public void powers()
{
System.out.println("He has super natural powers");
}
}
class SuperHero extends HasPowers implements CanFight,CanSwim,CanFly
{
public void swim()
{
System.out.println("He can Swim");
}
public void fly()
{
System.out.println("He can Fly");
}
public void fight()
{
System.out.println("He can Fight");
}
}
class MultipleInheritanceDemo1
{
public static void main(String args[])
{
SuperHero hero = new SuperHero();
hero.swim();
hero.fly();
hero.fight();
hero.powers();
CanFight cf = new SuperHero(); // you cannot create object for interfaces but you can object for the class which is implementing that particular interface
cf.fight();
}
}