package OOPsClassAndInheritance.TheObjectClass;

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
