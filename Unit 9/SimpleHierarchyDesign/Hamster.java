package SimpleHierarchyDesign;
public class Hamster extends SmallAnimal {
    public Hamster(String n, int a, double w) {
        super(n, a, w);
    }

    public void runOnWheel() {
        System.out.println(this.getName() + " is running on its wheel");
    }
}
