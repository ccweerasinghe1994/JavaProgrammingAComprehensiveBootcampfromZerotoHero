package section11;

public interface SuperHero extends Person {
    String usePower();

    /**
     * This method is used to stop a villain.
     * if Y is passed, it will stop the villain.
     * if N is passed, it will not stop the villain.
     *
     * @param a char
     * @return String
     */
    String stopVillain(char a);
}
