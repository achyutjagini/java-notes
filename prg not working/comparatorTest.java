import java.util.*;

class Student
{
private String name; 
private String idno;
 private int age; 
 private String city;
}

class studentbyname implements comparator {
    public int compare(Object o1,Object o2)
    {
    Student s1 = (Student) o1;
    Student s2 = (Student) o2;
    return s1.getName().compareTo(s2.getName()); }
    }
    
    class studentbyidno implements comparator {
    public int compare(Object o1,Object o2)
    {
    Student s1 = (Student) o1;
    Student s2 = (Student) o2;
    return s1.getIdNo().compareTo(s2.getIdNo()); }
    }
    class studentbyage implements comparator {
        public int compare(Object o1,Object o2)
        {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if( s1.getAge() > s2.getAge() ) 
        return 1;
        if( s1.getAge() < s2.getAge() ) 
        return -1;
        return 0;
        }
        }
        class studentbynameidno implements comparator {
        public int compare(Object o1,Object o2)
        {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if( s1.getName().compareTo(s2.getName()) == 0) return s1.getIdNo().compareTo(s2.getIdNo()); else
        return s1.getName().compareTo(s2.getName()); }
      }

        class studentbynameage implements comparator {
            public int compare(Object o1,Object o2)
            {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            if( s1.getName().compareTo(s2.getName()) == 0) 
            return s1.getAge()-s2.getAge();
            else
            return s1.getName().compareTo(s2.getName()); }
            }
    
            class comparatorTest
{
public static void main(String args[])
{
Student[] students = new Student[5];
Student[0] = new Student("John","2000A1Ps234",23,"Pilani");
 Student[1] = new Student("Meera","2001A1Ps234",23,"Pilani"); 
 Student[2] = new Student("Kamal","2001A1Ps344",23,"Pilani"); 
 Student[3] = new Student("Ram","2000A2Ps644",23,"Pilani"); 
 Student[4] = new Student("Sham","2000A7Ps543",23,"Pilani");
// Sort By Name
Comparator c1 = new studentbyname(); 
Arrays.sort(students,c1);
for(int i=0;i<students.length;i++) 
System.out.println(students[i]);
 
  // Sort By Idno
c1 = new studentbyidno(); 
Arrays.sort(students,c1);
for(int i=0;i<students.length;i++) 
System.out.println(students[i]);
// Sort By Age
c1 = new studentbyage(); Arrays.sort(students,c1);
for(int i=0;i<students.length;i++) System.out.println(students[i]);
// Sort by Name & Idno
c1 = new studentbynameidno(); Arrays.sort(students,c1);
for(int i=0;i<students.length;i++) System.out.println(students[i]);
// Sort by Name & Age
c1 = new studentbynameage(); 
Arrays.sort(students,c1);
for(int i=0;i<students.length;i++) 
System.out.println(students[i]); } // End of Main
} // End of test class.

