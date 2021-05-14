//Note, import rabbit.* only imports two classes, 
//not the sub-package run, or its classes.

import rabbit.run.*;
import rabbit.*;
class package1
{
public static void main(String args[])
{
Run1 a=new Run1();
a.run();

MotherRabbit b=new MotherRabbit();
b.say();
}
}