package section16;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] people = new String[]{
                "John",
                "Doe",
                "Jane"
        };


        String[] name3 = Arrays.copyOf(people, people.length + 1);
        System.out.println(Arrays.toString(name3));

        name3[3] = "Doe";
        System.out.println(Arrays.toString(name3));

        Integer myInt = 5;

        int myInt2 = 5;

    }
}
