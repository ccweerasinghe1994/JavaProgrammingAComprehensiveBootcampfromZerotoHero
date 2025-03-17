package section9.app;

import section9.model.Employee;
import section9.model.Person;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Hello, World!");

        MyOuterClass.InnerClass innerClass = new MyOuterClass.InnerClass();
        innerClass.print();

//        AccessModifiers examples
        AccessModifiers accessModifiers = new AccessModifiers();

        // public access modifier is accessible from anywhere
        System.out.println(accessModifiers.publicString);
        // protected access modifier is accessible within the package and subclasses
        System.out.println(accessModifiers.protectedString);
        // default access modifier is only accessible within the package
        System.out.println(accessModifiers.defaultString);
        // private  access modifier is only accessible within the class
//        System.out.println(accessModifiers.privateString);

        // method with private access modifier
//        accessModifiers.privateMethod();

        // method with default access modifier
        accessModifiers.defaultMethod();

        // method with protected access modifier
        accessModifiers.protectedMethod();

        // method with public access modifier
        accessModifiers.publicMethod();

        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        person.setSalary(1000.0);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: " + person.getSalary());

    }
}
