import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author Angelina Joy
 * @version April 30th 2020
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
   /**
    * @param hp
    * @param strength
    */
    public Creature(int hp, int strength)
   {
       this.hp = 10;
       this.strength = strength;
      
       
   }
   
 /**
  * @returns damage
  */   
   public int damage(){
       
      int damage = this.strength;
      return damage;
    }
  /**
   * if health is more than 0 
   * @return true
   * 
   */
   public boolean isAlive()
   {
      if(hp >=0)
      {
      return true;
      }
      
      return false;
       
    }
    /**
     * @param take damage
     * implements this health
     */
    public void takeDamage(int attackDamage)
    {
     this.hp = hp - attackDamage;    
        
    }
    /**
     * if health is less than 0
     * @return true
     */
   public boolean isDead()
   {
    if(hp<0)
    {
        return true;
   }
   return false;
  }
 /**
  * @returns value for health
  */
  public int getHealth()
  {
      return hp; 
  }
   
   
}
