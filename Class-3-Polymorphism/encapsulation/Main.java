public class Main
{
    public static void main(String[] args)
    {
        int a = 10;
        a = 20;
        
        Employee emp1 = new Employee();  // default construcor
        // emp1.id = 1;
        // emp1.name = "Karthik";

        Employee emp2 = new Employee();  // default construcor
        // emp1.id = 2;
        // emp1.name = "Madhan";
        
        emp1.setId(1);
        emp1.setName("Karthik");

        emp2.setId(2);
        emp2.setName("Madhan");

        Employee emp3 = new Employee();
        emp3.setId(emp1.getId());
        emp3.setName(emp1.getName());

        ////////////////////////////////////////////////////////
            // Client Interface
        /////////////////////////////////////////////////////////
        // System.out.println("Id of the employee emp1 is: " + emp1.id);
        // System.out.println("Id of the employee emp1 is: " + emp1.name);

        System.out.println("Id of the employee emp1 is: " + emp1.getId());
        System.out.println("Id of the employee emp1 is: " + emp1.getName());
        System.out.println("Id of the employee emp2 is: " + emp2.getId());
        System.out.println("Id of the employee emp2 is: " + emp2.getName());
        System.out.println("Id of the employee emp3 is: " + emp3.getId());
        System.out.println("Id of the employee emp3 is: " + emp3.getName());

    }
}