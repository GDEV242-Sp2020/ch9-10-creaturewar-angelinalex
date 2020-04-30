import java.util.Random; 
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    
   
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // initialise instance variables
          
        
        super(
            Randoms.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randoms.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
        
    }
    
    @Override
    public int damage()
    {
       Random randomNum= new Random(); 
       int damage;
       damage = randomNum.nextInt(MAX_ELF_STR); 
       int tenPercentChance = randomNum.nextInt(9);
       if(damage < MIN_ELF_STR + 1)
       {
           int i = MIN_ELF_STR - damage;
           damage+= i;       
           System.out.println("         Elf hits his opponent in the face!");
       }
       
       if(tenPercentChance == 0) 
       {
         damage = damage * 2; 
         
         System.out.println("          THE ELF HAS PERFORMED A MAGIC ATTACK!!!");
       } 
       
       
       return damage;  
    }
   
}
