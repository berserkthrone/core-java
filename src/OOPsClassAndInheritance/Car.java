package OOPsClassAndInheritance;


public class Car {

    private String brand = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

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
    //So, "THIS" is a special reference name for the object or instance, which it can use
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
