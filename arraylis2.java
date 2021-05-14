import java.util.*;

class arraylis2
{
    public static void main(String args[])  
    {
ArrayList<String> arrStr = new ArrayList(20);
  arrStr.add("A");
  arrStr.add("B");
   arrStr.add("X");
   arrStr.add("Y"); 
   arrStr.add("Z"); 
   // How to get an iterator for any collection 
 Iterator itr = arrStr.iterator(); 
   
 while(Itr.hasNext())//boolean hasNext()
                      // Returns true/false if there exists next element or not
{
    String str = itr.next(); 
    System.out.println("Hello "+str); 
}
}
}