import java.util.Arrays;
import java.util.Collections;

class compartest
{
public static void main(String args[])
{
int a[] ={10,6,8,9,45,-67};
String names[] = {"OOP","Java","UML","list"};
 double values[] = {10.56,3.45,8.56,2.67};

 Arrays.sort(a);
for(int i=0;i<a.length;i++) 
System.out.print(a[i]+" "); 
System.out.println("");

//Arrays.sort(a, Collections.reverseOrder());
Arrays.sort(names);
for(int i=0;i<names.length;i++) 
System.out.print(names[i]+" "); 
System.out.println("");

Arrays.sort(values);
for(int i=0;i<values.length;i++) 
System.out.print(values[i]+" "); 
System.out.println("");
//A[] arr = new A[10];
arr[0] = new A(10,6);
 arr[1] = new A(8,16); 
 arr[2] = new A(4,3); 
 arr[3] = new A(5,21); 
 arr[4] = new A(34,16);
Arrays.sort(arr);
for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" "); 
    System.out.println("");
}
}

}