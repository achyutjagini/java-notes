abstract class Account {
  private String name;
  private String actno; 
  private double balance; 
  
// Accessor Methods
   
// Overloaded Constructors 
Account(String n,String a) 
{
name = n;
actno= a;
balance = 0.0;
}

Account(String n,String a,double b) 
{
name = n;
actno= a;
balance = b;
}

// Accessor Methods
String getName() 
{ return name;}

String getactno() 
{ return actno;} 

double getbalance() 
{ return balance;}

// Mutator Method only for balance 
void setbalance(double amount)
{ this.balance = amount;}

void showAccountDetails()
{
System.out.println("Name: "+this.getName());
System.out.println("Account no: "+this.getactno());
System.out.println("Balance: "+this.getbalance());
}

}

class Saving extends Account {
    Saving(String n,String a)
    {
    super(n,a);

    System.out.println("Saving Account Created"); 

    
    showAccountDetails();
    }
    Saving(String n,String a,double b)
    {
    super(n,a,b);
    System.out.println("Saving Account Created"); 
    
     showAccountDetails();
    }


    double withdraw(double amount) {
        /*
        if( balance == 0) return 0.0;
        if( balance < amount ) return 0.0; balance = balance - amount;
        */

        //for invalid withdrawal
        if(this.getbalance() == 0) 
        return 0.0;
         if(this.getbalance() < amount ) 
         return 0.0; 

         setbalance(getbalance() - amount); 
         return amount;
       
        }

        void deposit(double amount) {
        setbalance(getbalance() + amount);//balance increased by amount
        return ; 
      }
        }//end of Saving class

 class Checking extends Account
{
Checking(String n,String a,double b) {
super(n,a,b);

System.out.println("Checking Account Created");
showAccountDetails();

}
double withdraw(double amount)
{
/*
if( balance - 100 == 0) return 0.0;
if( balance -100 < amount ) return 0.0; balance = balance - amount;
*/
if(this.getbalance() - 100 == 0) 
return 0.0; 

if(this.getbalance() - 100 < amount ) 
return 0.0;

setbalance(this.getbalance() - amount);
return amount;
}

void deposit(double amount) {
    setbalance(this.getbalance() + 0.9 * amount) ;//balance increased by 0.9*amount
    return ; 
  }
    
}//end of Checking class



    class AccountTest
{
public static void main(String args[])
{
Checking c1 = new Checking("Rahul Sharma","C106726",100000); 
Checking c2 = new Checking("Raman Kumar","C106727",100000);
Saving s1 = new Saving("Kumar Sharma","S106726",100000);
 Saving s2 = new Saving("Mohan Lal","S106727");
c1.withdraw(2000); 
c1.showAccountDetails();

 c2.deposit(10000); 
 c2.showAccountDetails(); 

 s1.deposit(900); 
 s1.showAccountDetails();

  s2.withdraw(400);
   s2.showAccountDetails(); }
}