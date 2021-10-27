import ru.ifmo.se.pokemon.*;

public class Dedenne extends Pokemon {

    public Dedenne(String name, int level){
        super(name, level);
        setStats(67, 58, 57, 81, 67, 101);
        setType(Type.ELECTRIC,Type.FAIRY);
        setMove(new Psychic(),new Psybeam(),new Zen_Headbutt(),new Charge_Beam());
    }
}
