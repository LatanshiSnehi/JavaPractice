public class Employee {

    String name;                  // instance
    static String company = "Microsoft";  // static

    // Constructor
    public Employee(String name) {
        // fill this

        this.name = name;
    }

    public void show() {
        // print output here
        System.out.println(name + " works at " + company);     
    }


    public static void main(String[] args) {

        Employee e1 = new Employee("Latanshi");
        Employee e2 = new Employee("Rahul");
        e1.show();
        e2.show();
    }
}

