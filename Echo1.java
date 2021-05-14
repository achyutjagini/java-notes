import java.io.*; // for File
import java.util.*; // for Scanner
 public class Echo1 {
public static void main(String[] args) throws FileNotFoundException {
Scanner input = new Scanner(new File("numbers.txt"));
double sum = 0.0;
while (input.hasNextDouble()) {
double next = input.nextDouble();
 System.out.println("number = " + next); 
 sum = sum + next;
}
System.out.printf("Sum = %.1f\n", sum); }
}