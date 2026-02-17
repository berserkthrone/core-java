package OOPsClassAndInheritance.Inheritance;

public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type,"small", weight);
        //here small is hard coded cant be change it will always be small
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.print("muscles moving");
    }
    private void moveBackFin() {
        System.out.print("backFin moving");
    }

    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }
}
