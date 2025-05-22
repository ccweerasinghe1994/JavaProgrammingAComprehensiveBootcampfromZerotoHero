package section11.impl;

import section11.SuperHero;

public class CaptainAmerica implements SuperHero {
    @Override
    public String usePower() {
        return "Captain America is using his power";
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
            return "Captain America Kills the villain";
        }
        if (a == 'N') {
            return "Captain America does not kill the villain";
        } else {
            return "Wrong input";
        }
    }
}
