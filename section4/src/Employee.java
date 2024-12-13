public class Employee {
    String firstName;
    String lastName;
    byte age;
    char gender;

    public Employee() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 25;
        this.gender = 'M';
        System.out.println("Employee object created!");
    }

    public Employee(String firstName, String lastName, byte age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
