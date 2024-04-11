import java.util.List;
import java.util.ArrayList;

public class StockMarketData
{
    public static void main(String[] args)
    {
        // Scanner input = new Scanner(System.in);
        // int numbers[]
        // int[] numbers, ages, salaries;
        // int[] numbers = new int[10];
        // int[] numbers = {1,2,3};
        String[] colors = {"Red", "Blue", "Green"};
        
        // List<T> 
        // List<String> stringList;

        // ArrayList<T> 
        // ArrayList<Integer> numbers = new ArrayList<Integer>(); // default size 10
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        // Integer value1 = new Integer(10);
        // Integer value2 = 10;   // Auto-boxing
        // int value3 = value1;   // Auto-unboxing
        numbers.add(1);  // add is a method available in ArrayList, which is used to add values
        numbers.add(2);
        numbers.add(3);  // numbers[2] = 3;
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);

        System.out.println(numbers.get(9));
        System.out.println(numbers.get(10));

        // for (int a : numbers)
        // for (int i = 0; i < numbers.size(); i++)
        // {
        //     System.out.println(numbers.get(i));
        // }
        int[] numbersP = {1,2,3,4,5,};
        // numbers[10];
        for (int number : numbersP)  // Enhance for loop OR for-each loop
        {
            System.out.println(number);
        }
    
    }
}