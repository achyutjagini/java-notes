interface A
{
double PI = 3.14156; 
void show();
void display(); 
}


class XYZ implements A
{

public void show() 
{  
System.out.println("abcd");
} 
public void display()
{ 
System.out.println("efgh");

} 
public static void main(String args[])
{
XYZ a=new XYZ();
    a.show();
    a.display();

}

}