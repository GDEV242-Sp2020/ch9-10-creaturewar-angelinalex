import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   private int health;
   private int strength;
   /**
    * Constructor fot creature
    */
   public Creature()
   {
       health = 10;
       strength = 10;
      
       
   }
   
   
 /**
  * returns damage
  */   
   public int damage(int damage){
       Random randomDamage= new Random(); 
       damage = randomDamage.nextInt(strength); 
       return damage;
    }
    
   public boolean isAlive(boolean alive)
   {
      if(health>0)
      {
      return true;
      }
      
      return false;
       
    }
    
   public boolean isDead()
   {
    if(health<0)
    {
        return false;
   }
   return true;
}
}
