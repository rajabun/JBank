
/**
 * Write a description of class Customer here.
 * 
 * @author  Muhammad Rajab/1206244415 
 * @version 1.0 (18 Februari 2016)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private Account accounts = new Account();
    private String cityAddress;
    private int custId;
    private String dateOfBirth;
    private String email;
    private String firstName;
    private String lastName;
    private int numberOfCurrentAccounts;
    private String streetAddress;
    private String phoneNumber;
    private String zipOrPostalCode;    

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
    }

    public Customer(String fname, String lname, String dob)
    {
        firstName = fname;
        lastName = lname;
        dateOfBirth = dob;
    }
    
    public Customer(String firstName, String lastName, String dateOfBirth, int custID)
    {
        firstName = firstName;
        lastName = lastName;
        dateOfBirth = dateOfBirth;
    }
    
    private String getAddress()
    {
        return streetAddress + cityAddress + zipOrPostalCode;
    }
    
    public Account getAccount()
    {
        return new Account();
    }
    
    private int getCustomerId()
    {
        return custId;
    }
    
    //private String getEmail()
    public String getEmail()
    {
        return email;
    }
    
    public String getName()
    {
        return lastName + "," + firstName;
    }
    
    public int getNumOfAccounts()
    {
        return numberOfCurrentAccounts;
    }
    
    private String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    private void setAddress(String street, String city, String code)
    {
        this.streetAddress = street;
        this.cityAddress = city;
        this.zipOrPostalCode = code;
    }
   
    public void setAccount (Account akun1)
    {
        this.accounts = akun1;
    }
    
    private void setEmail(String emailAddress)
    //public void setEmail(String emailAddress)
    {
        this.email = emailAddress;
    }
    
    public void setName(String lname, String fname)
    {
        this.firstName = fname;
        this.lastName = lname;
    }
    
    private void setPhoneNumber(String phoneNum)
    {
        this.phoneNumber = phoneNum;
    }
    
    //public String toString()
    //{
    //    return 
    //}
    
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
