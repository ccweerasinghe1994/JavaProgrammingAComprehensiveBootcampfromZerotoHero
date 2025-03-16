package section8;

public class FindTheDay {
    public static void main(String[] args) {
        String today = "Saturday";

        if (today.equals("Monday")) {
            System.out.println("Today is Monday");
        } else if (today.equals("Tuesday")) {
            System.out.println("Today is Tuesday");
        } else if (today.equals("Wednesday")) {
            System.out.println("Today is Wednesday");
        } else if (today.equals("Thursday")) {
            System.out.println("Today is Thursday");
        } else if (today.equals("Friday")) {
            System.out.println("Today is Friday");
        } else if (today.equals("Saturday")) {
            System.out.println("Today is Saturday");
        } else if (today.equals("Sunday")) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("Invalid day");
        }

        if (today.equals("Monday") || today.equals("Tuesday") || today.equals("Wednesday") || today.equals("Thursday") || today.equals("Friday")) {
            System.out.println("Today is a weekday");
        } else if (today.equals("Saturday") || today.equals("Sunday")) {
            System.out.println("Today is a weekend");
        } else {
            System.out.println("Invalid day");

        }


    }
}
