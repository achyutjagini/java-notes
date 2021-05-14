import java.util.*;
class arraylis3
{
public static void main(String args[]) {
ArrayList<String> arrStr = new ArrayList(20);
 arrStr.add("A");
arrStr.add("B");
arrStr.add("X");
arrStr.add("Y"); 
arrStr.add("Z");

// How to get an ListIterator for any collection for forward Traversal
System.out.println("Forward"); 
ListIterator Litr = arrStr.listIterator(); 
while(Litr.hasNext())
{
String str = (String) Litr.next(); 
System.out.println("Hello "+str); }

// How to get an ListIterator for any collection for Backward Traversal
System.out.println("Backward");
ListIterator Litr1 = arrStr.listIterator(arrStr.size());

while(Litr1.hasPrevious())
{
String str = (String) Litr1.previous();
 System.out.println("Hello "+str);
}
}
}