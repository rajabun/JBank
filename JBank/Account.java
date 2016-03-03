
/**
 * Write a description of class Account here.
 * 
 * 1. Kelas Account merupakan kelas yang memiliki informasi Akun milik Customer
 * 
 * @author  Muhammad Rajab/1206244415 
 * @version 1.0 (18 Februari 2016)
 * 1.1 (25 Februari 2016)
 * 1.2 (3 Maret 2016)
 */
public class Account
{
    // instance variables - deklarasi variabel pada kelas Account
    private char acctType;
    private double balance;
    private String id;

    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        // initialise instance variables
    }

    public Account(char type, double amount)
    {
        
    }
    
    public double deposit (double amount)
    {
        {
        
            if (amount >= 0) {System.out.println ("true");}
            //Jika nilai amount positif, sistem akan memberikan nilai true
        
            else if (amount < 0) {System.out.println ("false");} 
            //Jika nilai saldo saat ini negatif, sistem akan memberikan nilai FALSE
            
            balance = balance + amount;    //menambahkan saldo dari balance
            return balance;
        }
    }
    
    public char getAcctType()
    {
        return acctType;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String getID()
    {
        return id;
    }
    
    public void setBalance (double amount)
    {
        balance = amount;   
    }
    
    public void setID (String acctId)
    {
        id = acctId;
    }
    
    public void setAcctType(char type)
    {
        acctType = type;
    }
    
    private double withdraw (double amount)
    {
        {
        
            if (amount >= 0) {System.out.println ("true");}
            //Jika nilai amount positif, sistem akan memberikan nilai true
        
            else if (amount < 0) {System.out.println ("false");} 
            //Jika nilai saldo saat ini negatif, sistem akan memberikan nilai FALSE
            
            balance = balance - amount;    //mengurangi balance dengan jumlah saldo saat ini dan memasukkan ke balance
            return balance;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
}
