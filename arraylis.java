//javac -Xlint list.java
import java.util.*;
class arraylis
{
    public static void main(String args[])  
    {
ArrayList<String> arrStr = new ArrayList(20);//parametrized arraylist of type string
arrStr.add("A");
arrStr.add("B");
arrStr.add("X");
arrStr.add("Y"); 
arrStr.add("Z");    

    System.out.println("Forward"); 
    for(int i=0;i<arrStr.size();i++) {
  String str = arrStr.get(i); System.out.println("Hello "+str);  
  }
  System.out.println("Backward"); 
  
  for(int i= arrStr.size()-1;i>=0;i--)
{
String str = arrStr.get(i); System.out.println("Hello "+str); }
}
}