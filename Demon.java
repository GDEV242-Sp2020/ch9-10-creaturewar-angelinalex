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
    private static final int MAX_DEMON_HP = 30;
    private static final int MIN_DEMON_HP = 20;
    private static final int MAX_DEMON_STR = 25;
    private static final int MIN_DEMON_STR = 10;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
         super(
           
            Randoms.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,
            Randoms.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
        
    } 

    public Demon(int str, int hp) {
           super(str, hp);
    }
    
   
    public int damage() 
    {
       Random randomNum= new Random(); 
       
       int demonDamage = super.damage(); 
       demonDamage = randomNum.nextInt(19);
       
       
       if(demonDamage == 1) 
       {
         demonDamage=+50; 
         
         
       } 
       
       
       return demonDamage;  
        
      
    }
}
