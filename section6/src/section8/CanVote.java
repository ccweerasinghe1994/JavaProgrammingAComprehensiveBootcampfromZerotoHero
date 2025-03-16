package section8;

public class CanVote {
    public static void main(String[] args) {
        int age = 18;
        boolean isACitizen = false;
        boolean b = canVote(age, isACitizen);
        System.out.println("Can vote: " + b);
    }

    public static boolean canVote(int age, boolean isACitizen) {
        return age >= 18 && isACitizen;
    }
}
