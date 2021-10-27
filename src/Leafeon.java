import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Leafeon extends Pokemon {
    public Leafeon(String name, int level){
        super(name, level);
        setStats(65, 110, 130, 60, 65, 95);
        setType(Type.GRASS);
        setMove(new Rest(),new Confide(),new Facade(),new Psybeam());
    }
}