
import java.util.*;
import java.util.Collections;
class A
{
int a;
int b;
A(int a,int b) {
this.a=a;
this.b=b;
}
public String toString() {
return "a="+a+"b="+b; }
} // End of class A

class comparableTest2
{
public static void main(String args[])
{
ArrayList<Integer> arr1 = new ArrayList<Integer>(); ArrayList<String> arr2 = new ArrayList<String>(); ArrayList<Double> arr3 = new ArrayList<Double>();
// Adding into integer arraylist
arr1.add(10);
arr1.add(30); arr1.add(20);
 arr1.add(5);

 // Adding into String arraylist arr2.add("10"); arr2.add("30"); arr2.add("20"); arr2.add("5");
// Adding into Double arraylist arr3.add(10.56); arr3.add(30.12); arr3.add(20.34); arr3.add(5.56);
Collections.sort(arr1); System.out.println(arr1);
Collections.sort(arr2); System.out.println(arr2);
Collections.sort(arr3); System.out.println(arr3);
ArrayList<A> arr4 = new ArrayList<A>(); arr4.add(new A(10,6));
arr4.add(new A(2,4));
arr4.add(new A(5,16));
arr4.add(new A(100,16));
Collections.sort(arr4); System.out.println(arr4);
} }
