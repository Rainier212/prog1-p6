import java.util.HashMap;

/** 
 * Write a description of class MapTester here. __Part 3: HashMap class__
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> phoneBook;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        phoneBook = new HashMap<>();
    }

    public void enterNumber(String name, String number) // Question 4
    {
        phoneBook.put(name, number);
    }
    
    public String lookupNumber(String name) // Question 4
    {
        return phoneBook.get(name);
    }
    
    public void printAllNumbers() // Question 10
    {
        for(String name : phoneBook.keySet()){
            System.out.println(name + " : " + phoneBook.get(name));
        }
    }
}