package Dinosaur1;


/**
 * Write a description of class DinoDriver1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver1
{
    public static void main(String[] args)
    {
        Dinosaur d1 = new Dinosaur();
        Dinosaur d2 = new Dinosaur("TRex");
        
        Dinosaur[] pop = new Dinosaur[100];
        
        
       
        
  
        for(int i = 0; i < pop.length; i++)// loop 
        {
            pop[i] = new Dinosaur("TRex");
        
            int rand = (int)(Math.random()*40);
            for( int j = 0; j< rand; j++)
            {
                pop[i].ageUp();
            }
        }
        
        // Age up all dinos to a random age between 0 and 35.
        

        
        for(int i = 0; i < pop.length; i++)
        {
            System.out.print(pop[i]);
            int r = (int)(Math.random()*pop.length);
            System.out.println("\t"+pop[i].getBattleFactor(pop[r]));
        }
        
      
        
    }
}
