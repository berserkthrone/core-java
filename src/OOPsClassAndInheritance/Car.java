package OOPsClassAndInheritance;

//Public:- public means any other class in any package can access this class.
//Protected:- protected allow classes in the same package and any sub classes in other packages to have access to the member
//when the modifier is omitted this has special meaning called package access
//meaning the member is accessible only to classes in the same package.
//Private:- private means that no other class can access this member

public class Car {

    private String brand = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    // unlike local variables the above ones are class variables
    // need access modifiers

    //so we are using private classes variables which be access easily
    //although we can use public classes but it aint a good practise
    //so we need getter and setters
    //GETTER :- is a method on a class that retrieves the value of a
    // private field and returns it.
    //SETTER :- is a method on a class that sets the value of a private field
    // the purpose of these methods is to control and protect access to private fields


    // This provides encapsulation of the internals of our class and supports
    //maintenance of a public interface that does not have to change even though our class might.




    public String getBrand() {
        return brand;
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

    public void setBrand(String brand){

        if(brand == null) brand = "Unknown";
        String lowercaseMake = brand.toLowerCase();
        switch(lowercaseMake){
            case "holden", "porsche", "tesla" -> this.brand = brand;
            default -> {
                this.brand = "Unsupported ";
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

    //This :- ia a special keyword in java. What it really refers to is the instance
    //that was created when the object was instantiated.
    //So, "THIS" is a special reference name for the object or instance, ehich it can use
    // to describe itself.
    //And we can use "THIS" to access fields on the class.

    public void describeCar(){

        System.out.println(doors + "-Door " +
                color + " " +
                brand + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }

}
