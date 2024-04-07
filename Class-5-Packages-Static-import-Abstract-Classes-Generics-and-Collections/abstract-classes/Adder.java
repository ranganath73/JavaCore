public abstract class Adder
{
    public abstract int add(int num1, int num2);  // Method signature

    public int add3(int num1, int num2, int num3) {  // Non-abstract method
        return (num1 + num2 + num3);
    }
}