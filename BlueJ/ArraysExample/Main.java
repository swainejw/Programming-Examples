
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Contact c1 = new Contact("Jon1", "6135452394", "jonswaine1");
        Contact c2 = new Contact("Jon2", "5453453413", "jonswaine2");
        Contact c3 = new Contact("Jon3", "6155452394", "jonswaine3");
        Contact c4 = new Contact("Jon4", "6165452394", "jonswaine4");
        System.out.println(c2.getArea());
        Contact.deleteUser();
        System.out.println(Contact.getNumContacts());
        System.out.println(c1.compDigits(c2));
        System.out.println(c3);
    }
}
