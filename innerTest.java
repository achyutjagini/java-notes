class A
{
private int a; 
private int b=10;

A(int a) 
{ this.a=a; }

class B {
private int b;
B(int b)
{
this.b =b; 
}

void show() //method of class B
{
int b=20;
System.out.println("a="+a);
System.out.println("b="+b);

System.out.println("this.b="+this.b);//b of reference b1

System.out.println("Outer b="+A.this.b);
}

}//end of B inner class


void show()//show of class A
{
B b1 = new B(30); 
b1.show();
}

} // End of Outer class A


class innerTest
{
public static void main(String args[]) {
// Create an inner class B's instance // Call show() method
// STEP 1
// Create an Outer Instance first
A a1 = new A(20);//a=20

A.B b1 = a1.new B(-30); 

b1.show();

A.B b2 = new A(30).new B(-40); 
b2.show();

}
}
/*
a=20
b=20
this.b=-30
Outer b=10

a=30
b=20
this.b=-40
Outer b=10
*/