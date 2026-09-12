public class Contact
{
    private String fullName;
    private String phoneNumber;
    private String snapUser;
    private static int numContacts = 0;

    public Contact(String n, String pn, String su)
    {
        fullName = n;
        phoneNumber = pn;
        snapUser = su;
        numContacts++;
    }
    
    public String getName()
    {
        return fullName;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String p)
    {
        phoneNumber = p;
    }
    
    public void setSnapUser(String sn)
    {
        snapUser = sn;
    }
    
    public String getArea()
    {
        String su = phoneNumber.substring(0,3);
        if (su.compareTo("613") == 0)
        {
            System.out.println("Hey, that's from Kingston.");
        }
        return su;
    }

    public static boolean deleteUser()
    {
        if (numContacts > 0)
        {
            numContacts--;
            if (numContacts == 1)
            {
                System.out.println("you only have 1 contact left.");
            }
            else if (numContacts == 0)
            {
                System.out.println("no contacts remaining.");
            }
            return true;
        }
        
        System.out.println("you have no contacts left to delete");
        return false;
    }
    
    public static int getNumContacts()
    {
        return numContacts;
    }
    
    public int compDigits(Contact c)
    {
        return totalDigits(phoneNumber) - totalDigits(c.getPhoneNumber());
    }
    
    public int totalDigits(String s)
    {
        int tot = 0;
        for (int x = 0; x < s.length(); x++)
        {
            tot += Integer.valueOf(s.substring(x, x+1));
        }
        return tot;
    }
    
    public String toString()
    {
        return fullName + " has a phone number of " + 
        phoneNumber.substring(0,3) + "-" +
        phoneNumber.substring(3,6) + "-" +
        phoneNumber.substring(6);   
    }
}
