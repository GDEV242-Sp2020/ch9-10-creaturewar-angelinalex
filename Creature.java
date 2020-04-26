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
   
    public Creature(int hp, int straight)
   {
       hp = 10;
       strength = 10;
      
       
   }
   
 /**
  * returns damage
  */   
   public int damage(){
       Random randomDamage= new Random(); 
       int damage = randomDamage.nextInt(strength); 
       return damage;
    }
    
   public boolean isAlive()
   {
      if(this.hp<=0)
      {
      return false;
      }
      
      return true;
       
    }
    
    public void takeDamage(int attackDamage)
    {
     this.hp=- attackDamage;    
        
    }
    
   public boolean isDead()
   {
    if(this.hp<0)
    {
        return false;
   }
   return true;
  }

  public int getHealth()
  {
      return hp; 
  }
   
   
}
