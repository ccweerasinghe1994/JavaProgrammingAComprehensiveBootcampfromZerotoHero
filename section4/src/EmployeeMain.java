public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        System.out.println("Employee's age: " + employee1.getAge());
        System.out.println("Employee's gender: " + employee1.getGender());

        System.out.println("Employee's age: " + employee2.getAge());
        System.out.println("Employee' gender: " + employee2.getGender());

    }

}
