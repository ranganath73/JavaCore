public class Employee
{
    /// Data Portion
    // public int id;    // Highly Sesitive  // Level-1 // Toddling stge
    // public String name;

    // Data Member is HIDDEN // (1).Data Hiding
    private int id;    // Highly Sesitive  // Level-1 // Toddling stge
    private String name;
    /////////////////////////// Encapsulation
    //////// Accessor Interface
    public void setId(int id)   // Setter
    {
        this.id = id;
    }
    public int getId()  // Getter
    {
        return id;
    }
    public void setName(String name)  // Setter
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}