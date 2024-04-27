// Run time exception

public class MyArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 15;
        }
        try {
            for (int i = 0; i <= arr.length; i++) 
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.print("This array index is not existing.");
        } catch (Exception e) {
            
        }
        
        

        // for (int number : arr)
        // {
        //     System.out.println(number);
        // }
    }
}