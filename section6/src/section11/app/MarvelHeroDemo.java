package section11.app;

import section11.SuperHero;
import section11.impl.IronMan;
import section11.impl.SpiderMan;

public class MarvelHeroDemo {
    public static void main(String[] args) {
        SuperHero ironMan = new IronMan();
        invokeSuperHero(ironMan);

        SuperHero spiderMan = new SpiderMan();
        invokeSuperHero(spiderMan);

        SuperHero captainAmerica = new SpiderMan();
        invokeSuperHero(captainAmerica);
    }

    private static void invokeSuperHero(SuperHero superHero) {
        System.out.println(superHero.usePower());
        System.out.println(superHero.stopVillain('Y'));
    }
}
