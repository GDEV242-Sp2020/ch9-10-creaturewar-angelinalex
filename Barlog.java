
/**
 * Write a description of class Barlog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Barlog extends Demon
{
    // instance variables - replace the example below with your own
     private static final int MAX_DEMON_HP = 30;
    private static final int MIN_DEMON_HP = 20;
    private static final int MAX_DEMON_STR = 40;
    private static final int MIN_DEMON_STR = 15;

    /**
     * Constructor for objects of class Barlog
     */
    public Barlog()
    {
        // initialise instance variables
        super(
            Randoms.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,
            Randoms.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
            
        );
    }

    
    public int damage()
    {
        int barlogDamage = super.damage() * 2;
        
        
        
        barlogDamage= barlogDamage *2; 
        return barlogDamage; 
    }
}
