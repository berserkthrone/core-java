package OOPsClassAndInheritance;

//Public:- public means any other class in any package can access this class.
//Protected:- protected allow classes in the same package and any sub classes in other packages to have access to the member
//when the modifier is omitted this has special meaning called package access
//meaning the member is accessible only to classes in the same package.
//Private:- private means that no other class can access this member

public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){

        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported ";
            }
        }
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

//    public void setMake(String make) {
//        this.make = make;
//    }

    public void describeCar(){

        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
