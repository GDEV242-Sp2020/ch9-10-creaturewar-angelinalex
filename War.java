
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
    private ArrayList<Creature> underWorldArmy = new ArrayList<Creature>();
    Creature emperialWarrior;
    Creature underWorldWarrior;

    private Randoms r = new Randoms();
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        createEmperialArmy(50);
        createUnderworldArmy(45); 
    }
    
    private void createEmperialArmy(int numSoldiers)
    {
        
        
        for(int i=0; i < numSoldiers; i++)
          {
            
         int num = Randoms.nextInt(5);    
         
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
            
         int num = Randoms.nextInt(5);    
         
         if(num == 1)
         {
          underWorldArmy.add(new Barlog()); 
          
         }
         else if(num ==2) 
         {
           underWorldArmy.add(new Cyberdemon()); 
         }
         else{
             underWorldArmy.add(new Human()); 
            }
         
        }
      }
      
      public void Fight() {
         System.out.println("-----------------------------------------------------");
        System.out.println("--------------The war has begun!!--------------------");
        
        createEmperialArmy(50);
        createUnderworldArmy(45);
        
        while(emperialArmy.size() != 0  && underWorldArmy.size() != 0 )
        {
            
           
            
            emperialWarrior = emperialArmy.get(0); 
            underWorldWarrior = underWorldArmy.get(0);
            
            
            int whoGetsHit = Randoms.nextInt(2);
            
            if(whoGetsHit == 1 && emperialWarrior.getHealth() > 0)
            {
             emperialWarrior.takeDamage(underWorldWarrior.damage()); 
             
             
             
              if(emperialWarrior.isDead())
             {
              emperialArmy.remove(emperialWarrior);   
              System.out.println("--------------Emperial Warrior is dead!!!--------------------");
             }
             else if(emperialWarrior.isAlive())
             {
                 System.out.println("--------------Emperial Warrior is injured!!!--------------------");
             }
          
            }
        
         if(whoGetsHit == 2 && underWorldWarrior.isAlive())
            {
             underWorldWarrior.takeDamage(emperialWarrior.damage()); 
             
             
             
               if(!underWorldWarrior.isAlive())
             {
              underWorldArmy.remove(underWorldWarrior);   
              System.out.println("--------------Underworld Warrior is dead!!!--------------------");
             }
             else if(underWorldWarrior.isAlive())
             {
                 System.out.println("--------------Underworld Warrior is injured!!!--------------------");
             }
             
            }
            
            
            
             
            
       }
        
         if(emperialArmy.size() < 1)
         {
       System.out.println("--------------Underworld Warrior has won !!!!--------------------");
          
          
      }
        
     if(underWorldArmy.size() < 1)
      {
       System.out.println("--------------Underworld Warrior has won !!!!--------------------");
          
          
      }
      
       if(underWorldArmy.size() <= 0 && emperialArmy.size() <= 0)
      {
       System.out.println("--------------Everyone is dead !!!!--------------------");
          
          
      }


  }

}