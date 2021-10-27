import ru.ifmo.se.pokemon.*;

public class Lab2{

    public static void main(String[] args) {
        Battle b = new Battle();
        Dedenne p1 = new Dedenne("Дед", 1);
        Eevee p2 = new Eevee("Иви", 1);
        Leafeon p3 = new Leafeon("Лифон", 1);
        Bounsweet p4 = new Bounsweet("Боунсвит", 1);
        Steenee p5 = new Steenee("Тини", 1);
        Tsareena p6 = new Tsareena("Царина", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
