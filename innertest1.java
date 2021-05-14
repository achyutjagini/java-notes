
class A  //outer class
{
private int a;

A(int a)
{
this.a=a;
}
void print()
{
System.out.println("a="+a);   
}

class B//nested class with friendly access
{
int b;
B(int b)
{
 int c=b+10;
 this.b=c;   
}
void show()
{
print();//call to print of outer class
System.out.println("b="+b);
}
}//end of nested class B

}

class innertest1
{
public static void main(String args[]) {
    
A a1 = new A(10);
A.B b1 = a1.new B(100);
b1.show(); }
}