class A
{
private int a;
protected static int b=10; 
A(int a)
{
this.a=a;
}
public void show()
{ System.out.println("a="+a); 
display();
}
public static void display() 
{ System.out.println("b="+b); }

static class B
{
private int a;
protected static int b=100;
B(int a)
{
this.a=a;
}
void show()
{
// A.this.show(); // Won't work show() is non-static in outer // Will work as method is static in outer 
System.out.println("a="+a);
display();
// System.out.println("a="+A.this.a);

// Won't work a is non-static in outer 
System.out.println("b="+b); // Will refer to its own b 

System.out.println("A'sb="+A.b); // will refer to outer class B
new A(40).show();

// This is how you can call non static methods of outer
}
} // End of inner class B
} // End of class A

class innertest2
{
public static void main(String args[]) {
A.B b1 = new A.B(-30);
b1.show();
}
}
