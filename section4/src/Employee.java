public class Employee {
    static final String EMPLOYER = "ABC Company";
    String firstName;
    String lastName;
    byte age;
    char gender;

    {
        System.out.println("Employee object created!");
    }

    public Employee() {
        this("John", "Doe", (byte) 30, 'M');
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
