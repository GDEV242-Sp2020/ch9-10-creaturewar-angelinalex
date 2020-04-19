
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
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR,
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP
        );
    }

    @Override
    public int damage(int damage)
    {
        
        System.out.println("Double damage!");
        
        damage= damage *2; 
        return damage; 
    }
}
