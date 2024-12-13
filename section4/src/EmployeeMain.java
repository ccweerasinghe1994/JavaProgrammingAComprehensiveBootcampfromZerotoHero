public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        Employee employee3 = new Employee("Jane", "Doe", (byte) 25, 'F');
        Employee employee4 = new Employee("Alice", "Smith", (byte) 35, 'F');

        System.out.println("Employee's age: " + employee1.getAge());
        System.out.println("Employee's gender: " + employee1.getGender());

        System.out.println("Employee's age: " + employee3.getAge());
        System.out.println("Employee' gender: " + employee3.getGender());

        System.out.println("Employee' gender: " + employee4.getAge());
        System.out.println("Employee' gender: " + employee4.getGender());

    }

}
