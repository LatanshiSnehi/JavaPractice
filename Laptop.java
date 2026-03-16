public class Laptop {
    String brand;
    int ram;

    public Laptop(String brand, int ram){
        this.brand = brand;
        this.ram = ram;
    }

    public void show(){
        System.out.println("Laptop brand is: " + brand + "with ram: " + ram);
    }

    public static void main(String[] args){
        Laptop l = new Laptop("Lenovo", 256);
        Laptop l2 = new Laptop("dell", 1080);

        l.show();
        l2.show();
    }
}
