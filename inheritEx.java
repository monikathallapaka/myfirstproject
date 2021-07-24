class A
{
int x;
int y=10;
A()
{
System.out.println("A class");
}
A(int n)
{

System.out.println("a n class"+n);
}

void display()
{
System.out.println("y="+y);
}
}
class B extends A
{
int z=20;
void print()
{
System.out.println("z="+z);
}

}
class inheritEx
{
public static void main(String args[])
{
A a=new A();
B b=new B();
b.display();
b.print();
}
}
 