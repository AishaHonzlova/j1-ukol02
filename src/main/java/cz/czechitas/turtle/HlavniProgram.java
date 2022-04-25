package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        nakresliZmrzlinu(zofka);
    }

    private void nakresliTrojuhelnik(Turtle zofka) {
        zofka.turnRight(160);
        zofka.move(300);
        zofka.turnLeft(140);
        zofka.move(300);
        zofka.turnLeft(110.0);
        zofka.move(205);
        zofka.turnRight(90);
    }

    private void nakresliKolecko(Turtle zofka) {
        for(int i = 0; i < 90; i++) {
            zofka.turnRight(4);
            zofka.move(7);
        }
    }

    private void nakresliZmrzlinu(Turtle zofka) {
        nakresliTrojuhelnik (zofka);
        nakresliKolecko(zofka);
        }
    }
