package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        nakresliZmrzlinu(zofka);
        nakresliSnehulaka(zofka);
    }

    //ZMRZLINA

    private void nakresliTrojuhelnik(Turtle zofka) {
        zofka.setLocation(1100, 300);
        zofka.setPenColor(Color.ORANGE);
        zofka.turnRight(160);
        zofka.move(300);
        zofka.turnLeft(140);
        zofka.move(300);
        zofka.turnLeft(110.0);
        zofka.move(203);
        zofka.turnRight(90);
    }

    private void nakresliKolecko(Turtle zofka) {
        zofka.setPenColor(Color.PINK);
        for(int i = 0; i < 90; i++) {
            zofka.turnRight(4);
            zofka.move(7);
        }
    }

    private void nakresliZmrzlinu(Turtle zofka) {
        nakresliTrojuhelnik (zofka);
        nakresliKolecko(zofka);
        }


    // SNEHULAK

    private void nakresliHlavu(Turtle zofka) {
        zofka.setLocation(900,150);
        zofka.setPenColor(Color.BLUE);
        for(int i = 0; i < 126; i++) {
            zofka.turnRight(5);
            zofka.move(5);
            }
        }
    private void nakresliTelo(Turtle zofka) {
        for(int i = 0; i < 135; i++) {
            zofka.turnLeft(4);
            zofka.move(6);
        }
    }
    private void nakresliNohy(Turtle zofka) {
        for(int i = 0; i < 90; i++) {
            zofka.turnRight(4);
            zofka.move(7);
        }
    }
    private void nakresliRuce(Turtle zofka) {
        for(int i = 0; i < 25; i++) {
            zofka.turnLeft(4);
            zofka.move(6);
        }
        for(int i = 0; i < 72.8; i++) {
            zofka.turnRight(5);
            zofka.move(2);
        }
        zofka.turnLeft(85);
        zofka.penUp();
        zofka.move(165);
        zofka.turnRight(90);

        zofka.penDown();
        for(int i = 0; i < 72.8; i++) {
            zofka.turnLeft(5);
            zofka.move(2);
        }
    }

    private void nakresliSnehulaka(Turtle zofka) {
        nakresliHlavu(zofka);
        nakresliTelo(zofka);
        nakresliNohy(zofka);
        nakresliRuce(zofka);
    }
}
