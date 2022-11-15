package org.itmo.lab2;

import ru.ifmo.se.pokemon.*;
import org.itmo.lab2.pokemons.*;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();

        Mew p1 = new Mew("Cat", 1);
        Ferroseed p2 = new Ferroseed("Egg", 1);
        Ferrothorn p3 = new Ferrothorn("Flying object", 1);
        Litwick p4 = new Litwick("Litwick", 1);
        Lampent p5 = new Lampent("Lampent", 1);
        Chandelure p6 = new Chandelure("Chandelure", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}