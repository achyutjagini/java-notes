//interface
interface X
{
int x =10; //by default public final
void show(); //by default public abstract 
void display();//by default public abstract 
}
interface Y
{
    int y =10;   //static final
}

class A implements X,Y
{

public void show()
{ System.out.println("Hello"); }


public void display()
{ System.out.println("Hi"); }

public static void main(String ar[])
{
A a=new A();
a.show();
a.display();
System.out.println(y);

}
}
