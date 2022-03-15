package SimpleHierarchyDesign;
public class Dog extends Pet{
    public Dog(String n, int a, double w) {
        super(n, a, w);
    }

    public void bark() {
        System.out.println(this.getName() + " is barking");
    }

    public void dig() {
        System.out.println(this.getName() + " is digging");
    }
}
