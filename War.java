
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
        createEmperialArmy(5);
        createUnderworldArmy(5); 
        
        
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
        System.out.println("-----------------------------------------------------");
        System.out.println("--------------The war has begun!!--------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("----Between the Emperial and Underworld Army---------");
        System.out.println("-----------------------------------------------------");
        System.out.println("------        /                         -------------");
        System.out.println("------    O===[====================-    -------------"); 
        System.out.println("------        \\                         ------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        
        
        
        
        
        
        emperialWarrior = emperialArmy.get(0); 
        underWorldWarrior = underWorldArmy.get(0);
        
        createEmperialArmy(10);
        createUnderworldArmy(10); 
        
        
       while(emperialArmy.size() > 0 && underWorldArmy.size() > 0 )
       {
         
           if(emperialWarrior ==null)
           {
               emperialArmy.remove(0); 
              
           }
           
           if(underWorldWarrior == null)
           {
               underWorldArmy.remove(0);
               
           }
           
           int chance = Randoms.nextInt(2) +1; 
           
           
           if(chance == 1)
           {
              emperialWarrior.takeDamage(underWorldWarrior.damage()); 
              
          
             
              System.out.println("  Emperial warrior in the " +emperialWarrior.getClass() +" has been struck   ");
              System.out.println(" by the Underworld Warrior in the " +underWorldWarrior.getClass() +  "!!  ");
             
            
              
           }
           else
           {
               underWorldWarrior.takeDamage(emperialWarrior.damage()); 
               
            
             
              System.out.println("  Underworld warrior in the "  +underWorldWarrior.getClass() +  " has been struck  ");
              System.out.println("   by the EmperialWarrior in the "  +emperialWarrior.getClass() +    "!  ");
             
             
               
               
            }
           
           
           if(underWorldWarrior.getHealth() < 1)
           {
               emperialArmy.remove(0);
               
               
                System.out.println("  Emperial Warrior from the "+ emperialWarrior.getClass() + "  ");
                System.out.println("                  is dead!!                   ");
                
               
               
           }
           
           if(underWorldWarrior.getHealth() < 1)
           {
               underWorldArmy.remove(0);
               
               
              
               System.out.println("   Underworld Warrior from the "+ underWorldWarrior.getClass() + "");
               System.out.println("                  is dead!!                   ");
                
             
           }
           
           
           
           
           
           
            
        }
        
        
        
        
         if(emperialArmy.size() < 1 && underWorldArmy.size() > 0)
         {
         System.out.println("-----------------------------------------------------");
         System.out.println("------------Underworld Army has won !!!!-------------");
         System.out.println("-----------------------------------------------------"); 
           System.out.println("-----------------------------------------------------");
       System.out.println("------        /                         -------------");
       System.out.println("------    O===[====================-    -------------"); 
       System.out.println("------        \\                         ------------");
       System.out.println("-----------------------------------------------------");
       System.out.println("--------------the war is over!-----------------------");
       System.out.println("-----------------------------------------------------");
       System.out.println("-----------------------------------------------------");
        }
        
         if(underWorldArmy.size() < 1 && emperialArmy.size() < 0)
        {
        System.out.println("-------------------------------------------------------");
        System.out.println("--------------Emperial Army has won !!!!---------------");
        System.out.println("-------------------------------------------------------");
         System.out.println("-----------------------------------------------------");
         System.out.println("------        /                         -------------");
       System.out.println("------    O===[====================-    -------------"); 
       System.out.println("------        \\                         ------------");
       System.out.println("-----------------------------------------------------");
       System.out.println("--------------the war is over!-----------------------");
       System.out.println("-----------------------------------------------------");
       System.out.println("-----------------------------------------------------");  
          
        }
      
        if(underWorldArmy.size() <= 0 && emperialArmy.size() <= 0)
       {
           
       System.out.println("-----------------------------------------------------");
       System.out.println("-------------Everyone has died!!!--------------------");
       System.out.println("-----------------------------------------------------");
       System.out.println("-----------------------------------------------------");
       System.out.println("------        /                         -------------");
       System.out.println("------    O===[====================-    -------------"); 
       System.out.println("------        \\                         ------------");
       System.out.println("-----------------------------------------------------");
       System.out.println("--------------the war is over!-----------------------");
       System.out.println("-----------------------------------------------------");
       System.out.println("-----------------------------------------------------");
          
          
       }
  

  }

}