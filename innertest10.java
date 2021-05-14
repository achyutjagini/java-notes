class A
{
private int a;

A(int a)
{
this.a =a;
}

void print()
{ System.out.println("a="+a); }

static class B {
int b;
B(int b)
{
int c = b+10;
this.b = c;
}
void show()
{
// print(); INVALID
A a1 = new A(10);
a1.print(); 

System.out.println("b="+b); }
} // End of class B
} // End of class A

class innertest10
{
public static void main(String args[]) {
A.B b1 = new A.B(100);
b1.show();
}
}