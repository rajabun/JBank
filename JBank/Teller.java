
/**
 * Write a description of class Teller here.
 * 
 * Deskripsi kelas Teller:
 * 1. Kelas Teller ini merupakan main class yang ada pada program JBank
 * 2. Semua kelas yang ada pada program JBank diawali dari kelas Teller
 *    karena kelas ini ditunjukkan sebagai program utama JBank yang dijalankan
 * 3. Kelas Teller memiliki method main, sebagai program utama yang akan dijalankan. 
 * @author  Muhammad Rajab/1206244415 
 * @version 1.0 (18 Februari 2016)
 */
public class Teller
{
    // instance variables - replace the example below with your own
    private int x;
    private Account a2;
    private double balance;

    public void main (String [] args)
    {
        Customer c1 = new Customer();
        //String a = "Sanadhi";
        //String b = "Sutandi";
        //c1.setName(a, b);
        c1.setName("Sanadhi", "Sutandi");
        //c1.setName(lname, fname);
        //System.out.println(c1.toString());
        //System.out.println(c1);
        System.out.println(c1.getName());
        Account a1 = new Account();
        a1.setBalance(65000);
        c1.setAccount(a1);
        a2 = c1.getAccount();
        balance = a2.getBalance();
        System.out.println(balance);
    }
    
    /**
     * Constructor for objects of class Teller
     */
    public Teller()
    {
        // initialise instance variables
        x = 0;
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
        return x + y;
        
    }
}
