import java.util.*;
class list
{
public static void main(String args[]) {
ArrayList arr = new ArrayList();
ArrayList arr1 = new ArrayList(20);

 System.out.println(arr.size());
  System.out.println(arr.size());
// Adding Elements

//arr.add(10);
 arr.add(new Integer(10));
arr.add("A");
arr.add(new Double(12.56));
arr.add(new Boolean(true));
arr.add(new Integer(30));
System.out.println(arr.size()); 
 arr1.addAll(arr);
}
}