/*An interface is an abstract "class" that is used to group 
related methods with "empty" bodies:
To access the interface methods, the interface must be "implemented" 
(kinda like inherited) by another class with the implements keyword 
(instead of extends). The body of the interface method is provided by the
 "implement" class:*/

import java.util.*;
class BOX implements Comparable<BOX> {
private double l,b,h;

// Overloaded Constructors
 BOX(double a)
{ 
l=b=h=a;
}

BOX(double l,double b,double h) 
{ this.l=l; this.b=b; this.h=h; }
// Acessor Methods
public double getL()
{ return l;
}
public double getB()
{ return b;
}
public double getH()
{ return h;
}

// area() Volume()  Methods
double area()
{
return 2*(l*b+b*h+h*l);
}
double volume()
{
return l*b*h;
}
// isEquals() method
boolean isEquals(BOX other)
{
if(this.area() == other.area()) return true; return false;
/* OR
if(area() == other.area()) return true return false;
*/
}
static boolean isEquals(BOX b1, BOX b2)
{
if(b1.area() == b2.area()) 
return true; 
return false;
}

// compareTo method
public int compareTo(BOX other)
{
if(area() > other.area()) return 1; if(area() < other.area()) return -1; return 0;
}
public String toString()
{
String s1="length:"+l; String s2="width:"+b;
String s3="area:"+h;
String s4="Area:"+area(); String s5="Volume:"+volume(); return s1+s2+s3+s4+s5;
}
} // End of class BOX

class comparableTest10
{
public static void main(String args[])
{
ArrayList<BOX> boxes = new ArrayList<BOX>(); 
boxes.add(new BOX(10));
boxes.add(new BOX(20));
boxes.add(new BOX(10,6,8));
boxes.add(new BOX(4,6,10));
boxes.add(new BOX(10,12,14));
Iterator itr = boxes.iterator(); 
while(itr.hasNext()) 
System.out.println((BOX)itr.next());
Collections.sort(boxes);
Iterator itr1 = boxes.iterator(); 
while(itr1.hasNext()) 
System.out.println((BOX)itr1.next()); 

}
}