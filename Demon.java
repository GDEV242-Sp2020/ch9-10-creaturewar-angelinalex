import java.util.Random; 
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 200;
    private static final int MIN_DEMON_HP = 0;
    private static final int MAX_DEMON_STR = 200;
    private static final int MIN_DEMON_STR = 0;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
         super(
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR,
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP
        );
        
    } 

    public Demon(int str, int hp) {
           super(str, hp);
    }
    
    @Override
    public int damage(int damage) 
    {
        Random randomNum= new Random(); 
       
       damage = randomNum.nextInt(19);
       
       
       if(damage == 1) 
       {
         damage=+50; 
         
         System.out.println("Magic attack!");
       } 
       
       
       return damage;  
        
      
    }
}
