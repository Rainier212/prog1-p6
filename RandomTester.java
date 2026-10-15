import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class randomTester here. __Part 2: Random class__
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random generator;

    /**
     * Constructor for objects of class randomTester
     */
    public RandomTester()
    {
        generator = new Random();
    }

    public void printOneRandom() // Question 3
    {
        System.out.println(generator.nextInt(100));
    }
    
    public void printMultiRandom(int howMany) // Question 3
    {
        int count = 0;
        while(count < howMany){
            System.out.println(generator.nextInt(100));
            count++;
        }
    }
    
    public int throwDice() // Question 5
    {
        int random = generator.nextInt(6);
        return random + 1;
    }
    
    public String getResponse() // Question 6
    {
        ArrayList<String> responses = new ArrayList<>();
        
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        
        int index = generator.nextInt(3);
        // int index = generator.nextInt(responses.size());   <-- Question 7
        return responses.get(index);
    }
    
    public int getUpToMax(int max) // Question 8
    {
        int random = generator.nextInt(max);
        return random + 1;
    }
    
    public int getUpToMax2(int max) // 2nd part of Question 9 
    {
        return getInRange(1, max);
    }
    
    public int getInRange(int min, int max) // Question 9
    {
        int random = generator.nextInt(max - min + 1);
        return random + min;
    }
}