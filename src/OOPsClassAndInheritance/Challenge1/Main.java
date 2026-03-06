package OOPsClassAndInheritance.Challenge1;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345",500,
                "Bob Brown","myemail.com","(087) 123 -4567");
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(200.0);

    }

    //Constructor:- is used in the creation of an object.
    //It is a special type of code block that has a specific name and parameters,
    //much like a method.
    //it has the same name as the class itself, and it does not return any values.
    //You never include a return type from a constructor, not even void.
    //you can, and should, specify an appropriate access modifier to control who
    //should be able to create new instances of the class, using this constructor.
    //if a class contains no constructor declarations, then a default constructor is
    //implicitly declared.
    //This constructor has no parameters and is
    //often called the no-args(no arguments) constructor.
    //If a class contains any other constructor declarations, then a default constructor
    //is NOT implicitly declared.

    //CONSTRUCTOR OVERLOADING is declaring multiple
    //constructors with different parameters.
    //The number of parameters is the same between two constructors, their types,
    //or order of the types must differ.
}
