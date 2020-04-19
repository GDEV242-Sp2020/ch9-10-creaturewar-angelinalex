import java.util.ArrayList;
import java.util.Random; 
/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    
    private ArrayList<Creature> emperialArmy = new ArrayList<Creature>();
    private ArrayList<Creature> underWorldlArmy = new ArrayList<Creature>();

    private Randomizer r = new Randomizer();
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        createEmperialArmy(300);
        createUnderworldArmy(300); 
    }
    
    private void createEmperialArmy(int numSoldiers)
    {
        
        
        for(int i=0; i < numSoldiers; i++)
          {
            
         int num = Randomizer.nextInt(5);    
         
         if(num == 1 || num == 2) {
             
         emperialArmy.add(new Elf()); 
         
      
          }
          else
          {
              emperialArmy.add(new Human()); 
          }

    
        }
      }

    private void createUnderworldArmy(int numSoldiers)
    {
        
        
        for(int i=0; i < numSoldiers; i++)
          {
            
         int num = Randomizer.nextInt(5);    
         
         if(num == 1)
         {
          underWorldlArmy.add(new Barlog()); 
          
         }
         else if(num ==2) 
         {
           underWorldlArmy.add(new Cyberdemon()); 
         }
         else{
             underWorldlArmy.add(new Human()); 
            }
         
        }
      }
      
      public void Fight()
      {
          
          Creature emperialWarrior = null;
          Creature underworldWarrior = null;
          boolean emperialAlive = false;
          boolean underworldAlive  = false; 
          
          while(emperialArmy.size() > 0 && underWorldlArmy.size() > 0 || emperialArmy.size() > 0 && underworldAlive || underWorldlArmy.size() > 0 && emperialAlive) 
          {
              
              
          
          
          }
        }
}
