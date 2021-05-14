import java.io.*; // for File
import java.util.*; // for Scanner 
public class Echo2 {
public static void main(String[] args) throws FileNotFoundException {
Scanner input = new Scanner(new File("numbers2.txt")); 
double sum = 0.0;

while (input.hasNext()) {
if (input.hasNextDouble()) {
double next = input.nextDouble(); 
System.out.println("number = " + next); 
sum = sum + next;
} 
else {
input.next(); // throw away the bad token
}
}
System.out.printf("Sum = %.1f\n", sum); }
}