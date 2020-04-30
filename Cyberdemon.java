
/**
 * Write a description of class Cyberdemon here.
 *
 * @author Angelina Joy
 * @version April 30th 2020
 */
public class Cyberdemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 40;
    private static final int MIN_DEMON_HP = 25;
    private static final int MAX_DEMON_STR = 30;
    private static final int MIN_DEMON_STR = 20;

    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
       super(
            Randoms.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR,
            Randoms.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP
        );
        
    }
    /**
     * @returns damage
     * @overrides damage in creture class
     */
     @Override
    public int damage()
    {
        int cyberDamage = Randoms.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR;
        
        
        
        
        
        System.out.println(" Cyberdemon attacks!!!!");
        return cyberDamage; 
    }
   
}
