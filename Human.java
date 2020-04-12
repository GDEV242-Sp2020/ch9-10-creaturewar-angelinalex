import java.util.Random; 
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private int max_human_hp= 30;
    private int min_human_hp = 10;
    private int max_human_st = 18;
    private int min_human_st = 5; 

    /**
     * Constructor for objects of class Human
     */
    public Human(int strength, int hp)
    {  
       
        
        
    }
    
    public int getStrength(int h_strength)
    {
     Random r = new Random(); 
     h_strength = r.nextInt(max_human_st); 
     
     if(h_strength < min_human_st)
     {
         int value = min_human_st - h_strength;
         h_strength+=value; 
     }
     
     return h_strength;
     
    }
}
