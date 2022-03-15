package SimpleHierarchyDesign;
public class SmallAnimal extends Pet {
    public SmallAnimal(String n, int a, double w) {
        super(n, a, w);
    }

    public void chew() {
        System.out.println(this.getName() + " is chewing");
    }
}
