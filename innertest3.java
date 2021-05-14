
//Anonymous Inner Class Example
class A
{
private int a; A(int a)
{
this.a =a;
}
void show()
{ System.out.println("a="+a); } // End of show()
}// End of class A

class innertest1
{
public static void main(String args[]) {

A a1 = new A(20){

public void show()
{
super.show(); System.out.println("Hello"); }
public void display()
{ System.out.println("Hi"); }
};

a1.show();
// a1.display(); }
}
}

interface X
{
int sum(int a,int b);
int mul(int x,int y);
}


class innertest3
{
public static void main(String args[]) {

    X x1 = new X() {
public int sum(int a,int b)
{
return a+b;
}
public int mul(int a,int b) {
return a*b;
}
};

System.out.println(x1.sum(10,20)); 
System.out.println(x1.mul(10,20)); }
}
