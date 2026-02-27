public class Employee {

    String name;                
    static String company = "Microsoft";
    public Employee(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + " works at " + company);     
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Latanshi");
        Employee e2 = new Employee("Rahul");
        e1.show();
        e2.show();
    }
}

