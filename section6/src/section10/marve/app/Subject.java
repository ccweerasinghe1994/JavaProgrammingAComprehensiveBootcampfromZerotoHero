package section10.marve.app;

public abstract class Subject {

    public static int MINIMUM_MARKS = 40;
    private String name;

    public int totalMarks() {
        return 100;
    }

    public abstract void teach();
}
