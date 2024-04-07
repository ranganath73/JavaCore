// import a.A;  (1) 1st way of importing a package
// import a.*;

// Static import in Java:
// --------------------
import static a.A.PI;  // You can import only static variables/constants/methods

public class Main
{
    public static void main(String[] args) {
        // A aObj = new A();
        System.out.println(PI);  // Calling a 
    }
}