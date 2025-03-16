package section7;

public class AssignmentOperatorDemo {
    public static void main(String[] args) {
//        multiple lines
        int num1;
        int num2;
        num1 = num2 = 12;
//        single line
        int num3, num4, num5;
        num3 = num4 = num5 = 122;
//        the = operator always going to execute from right to left <-
//        the value of the right side is going to be assigned to the left side
//        num5 = 122 -> num5 -> num4 -> num3

        int value1 = 12;
        System.out.println("value1 " + value1);
        int value2 = 34;
        System.out.println("value2 " + value2);

        value2 = value1;
        System.out.println("value2 " + value2);
        value1 = 1222;
        System.out.println("value1 " + value1);
        System.out.println("value2 " + value2);
//        in java primitive data types are stored in the stack memory
//        when we assign value1 to value2, the value of value1 is copied to value2
//        so, value2 is not pointing to value1, it is just a copy of value1 at that time
//        so, when we change the value of value1, value2 is not going to change

        Person person1 = new Person("abc");
        Person person2 = new Person("efg");
        System.out.println(person1.name);  // abc
        System.out.println(person2.name); // efg
        person2 = person1;
        System.out.println(person2.name); // abc
        person2.name = "changes";
        System.out.println(person1.name);   // changes
        System.out.println(person2.name);  // changes
//        in java, objects are stored in the heap memory
//        when we assign person1 to person2, person2 is pointing to the same object as person1
//        so, when we change the value of person2, person1 is also going to change
            

//        declaring multiple variables in a single line
        int a, b, c;
        a = 12;
        b = 23;
        c = 34;
        System.out.println(a); // 12
        System.out.println(b); // 23
        System.out.println(c); // 34

    }
}
