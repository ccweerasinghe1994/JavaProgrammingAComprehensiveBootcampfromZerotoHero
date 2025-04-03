package section11.impl;

import section11.SuperHero;

public class SpiderMan implements SuperHero {
    @Override
    public String usePower() {
        return "Spider Man is using his power";
    }

    /**
     * This method is used to stop a villain.
     * if Y is passed, it will stop the villain.
     * if N is passed, it will not stop the villain.
     *
     * @param a char
     * @return String
     */
    @Override
    public String stopVillain(char a) {
        if (a == 'Y') {
            return "Spider Man Kills the villain";
        }
        if (a == 'N') {
            return "Spider Man does not kill the villain";
        } else {
            return "Wrong input";
        }
    }
}
