public class NextArea extends Calculator
{
    @Override     // Overriding
    public double area(double side)
    {
        return side * side;
    }

    // Overloading
    public double area(double side1, double side2)
    {
        return side1 * side2;
    }
}

// Poly => Many
// Morph => Shape or Form