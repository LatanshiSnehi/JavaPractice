public class ConstructorLearning {
    String name;

    public ConstructorLearning(String s){
        this.name = s;
    }

    public void student(){
        System.out.println(name);
    }

    public static void main(String[] args){
        ConstructorLearning l = new ConstructorLearning("latanshi");
        l.student();

    }
}
