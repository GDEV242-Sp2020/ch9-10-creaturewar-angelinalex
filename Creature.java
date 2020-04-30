import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   private int hp; 
   private int strength;
   /**
    * Constructor fot creature
    */
   public Creature()
   {
       hp = 10;
       strength = 10;
      
       
   }
   
    public Creature(int hp, int strength)
   {
       this.hp = 10;
       this.strength = strength;
      
       
   }
   
 /**
  * returns damage
  */   
   public int damage(){
       
       int damage = Randoms.nextInt(strength); 
       return damage;
    }
    
   public boolean isAlive()
   {
      if(hp >=0)
      {
      return true;
      }
      
      return false;
       
    }
    
    public void takeDamage(int attackDamage)
    {
     this.hp= hp - attackDamage;    
        
    }
    
   public boolean isDead()
   {
    if(hp<0)
    {
        return true;
   }
   return false;
  }

  public int getHealth()
  {
      return hp; 
  }
   
   
}
