
/**
 * Write a description of class Barlog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Barlog extends Demon
{
    // instance variables - replace the example below with your own
     private static final int MAX_DEMON_HP = 200;
    private static final int MIN_DEMON_HP = 800;
    private static final int MAX_DEMON_STR = 100;
    private static final int MIN_DEMON_STR = 50;

    /**
     * Constructor for objects of class Barlog
     */
    public Barlog()
    {
        // initialise instance variables
        super(
            Randoms.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR,
            Randoms.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP
        );
    }

    
    public int damage()
    {
        int barlogDamage = super.damage() * 2;
        
        System.out.println("Double damage!");
        
        barlogDamage= barlogDamage *2; 
        return barlogDamage; 
    }
}
