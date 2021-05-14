//page 24 of 73
import java.util.*;
class BOX
{
private double l,b,h;
// Overloaded Constructors 
BOX(double a)
{ l=b=h=a;
}

BOX(double l,double b,double h) {
this.l=l;
this.b=b;
this.h=h;
}
// Acessor Methods
public double getL()
{return l;
}
public double getB()
{ return b;
}
public double getH()
{ return h;
}

// area() Volume() Methods 
double area()
{
return 2*(l*b+b*h+h*l);
}

double volume()
{
return l*b*h;
}

// isEquals() method
boolean isEqual(BOX other)
{
if(this.area() == other.area())
 return true; 
 return false;
/* OR
if(area() == other.area()) return true return false;
*/
}

static boolean isEquals(BOX b1, BOX b2) {
if(b1.area() == b2.area()) 
return true; 
return false;
 }


public String toString()
{
String s1="length:"+l;
String s2="width:"+b;
String s3="height:"+h;
String s4="Area:"+area(); 
String s5="Volume:"+volume(); 
return s1+s2+s3+s4+s5;
}

} // End of class BOX


class SORTBOXBYLENGTH implements Comparator<BOX>
{
private int order; // Defines Order of sorting 
//1 for Ascending -1 for Descending 

SORTBOXBYLENGTH(boolean isAscending)
{
if(isAscending)
order =1;

else
order =-1;
}

public int compare(BOX b1,BOX b2)
{
if(b1.getL() > b2.getL()) 
return 1*order;

if(b1.getL() < b2.getL()) 
return -1*order;

return 0;
}
}

class SORTBOXBYWIDTH implements Comparator<BOX>
{
private int order; 
SORTBOXBYWIDTH(boolean isAscending)
{
if(isAscending)//if boolean true
order =1;
else
order =-1;
}
public int compare(BOX b1,BOX b2)
{
if(b1.getB() > b2.getB()) 
return 1*order; 
if(b1.getB() < b2.getB()) 
return -1*order; 
return 0;
}
} 

class SORTBOXBYHEIGHT implements Comparator<BOX>
{
private int order; 

SORTBOXBYHEIGHT(boolean isAscending)
{
if(isAscending)
order =1;
else
order =-1;
}
public int compare(BOX b1,BOX b2)
{
if(b1.getH() > b2.getH()) 
return 1*order;

 if(b1.getH() < b2.getH())
 return -1*order; 
 return 0;
}
}


class SORTBOXBYAREA implements Comparator<BOX>
{
private int order;
SORTBOXBYAREA(boolean isAscending)
{
if(isAscending)
order =1;
else
order =-1;
}
public int compare(BOX b1,BOX b2)
{
if(b1.area() > b2.area())
 return 1*order; 

 if(b1.area() < b2.area())
  return -1*order; 
  return 0;
}
}

class SORTBOXBYVOLUME implements Comparator<BOX>
{
private int order;

SORTBOXBYVOLUME(boolean isAscending)//constructor
{
if(isAscending)
order =1;
else
order =-1;
}
public int compare(BOX b1,BOX b2)
{
if(b1.volume() > b2.volume())
 return 1*order; 
if(b1.volume() < b2.volume()) 
return -1*order;
 return 0;
}
}

class comparatorTest
{
public static void main(String args[]) {
ArrayList<BOX> boxes = new ArrayList<BOX>(); //boxes is an arraylist
                                             //empty list with capacity 10
boxes.add(new BOX(10));//second
boxes.add(new BOX(20));
boxes.add(new BOX(10,6,8));//third
boxes.add(new BOX(4,6,10));//after sorting this is first
boxes.add(new BOX(10,12,14));

// SORT BY LENTH ORDER:Ascending               //isascending=true
Comparator<BOX> c1 = new SORTBOXBYLENGTH(true);//order=1
                
Collections.sort(boxes,c1);

for(int i=0;i<boxes.size();i++) 
System.out.println(boxes.get(i)); 
System.out.println("");

// SORT BY LENTH ORDER:Descending
c1 = new SORTBOXBYLENGTH(false);
Collections.sort(boxes,c1);
for(int i=0;i<boxes.size();i++)
 System.out.println(boxes.get(i)); 
 System.out.println("");
 
// SORT BY Volume ORDER:Ascending
c1 =new SORTBOXBYVOLUME(true);
Collections.sort(boxes,c1);
for(int i=0;i<boxes.size();i++) 
System.out.println(boxes.get(i)); 
System.out.println("");

// SORT BY Volume ORDER:Descending
c1 =new SORTBOXBYVOLUME(false);
Collections.sort(boxes,c1);
for(int i=0;i<boxes.size();i++)
System.out.println(boxes.get(i));
System.out.println("");

}
} 