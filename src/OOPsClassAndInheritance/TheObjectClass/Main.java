package OOPsClassAndInheritance.TheObjectClass;

//Public:- public means any other class in any package can access this class.
//Protected:- protected allow classes in the same package and any sub classes in other packages to have access to the member
//when the modifier is omitted this has special meaning called package access
//meaning the member is accessible only to classes in the same package.
//Private:- private means that no other class can access this member

public class Main extends Object {

    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max);
    }
}

class Student {

    private String name;
    private int age;


    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public String toString(){
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}
