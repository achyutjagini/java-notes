import java.util.*;
import java.util.Collection;
class BOX implements Comparable
{
private double length;
private double width;
private double height;

BOX(double l,double b,double h)
{
length=l;width=b;height=h;
}
//to access private use getters 
/*
public double getLength() { return length;}
public double getWidth() { return width;}
public double getHeight() { return height;}
public double getArea()
{
return 2*(length*width + width*height+height*length); }
*/
public double getVolume()
{
return length*width*height;
}

public int compareTo(Object other)//main thing in program
{
BOX b1 =(BOX) other;//Other parameter has to be type caste to BOX type before use

if(this.getVolume() > b1.getVolume()) return 1;//if greater than other return 1 
if(this.getVolume() < b1.getVolume()) return -1;
return 0;
}

public String toString()
{
return "Length:"+length+" Width :"+width +" Height :"+height; }
}

class comparabletest
{
public static void main(String[] args)//sorting using arrays
{
    BOX[] box = new BOX[5];//array of objects of Box class

    box[0] = new BOX(10,8,6);
box[1] = new BOX(5,10,5);
box[2] = new BOX(8,8,8);
box[3] = new BOX(10,20,30);
box[4] = new BOX(1,2,3);
Arrays.sort(box);
for(int i=0;i<box.length;i++)
System.out.println(box[i]);
}
}

