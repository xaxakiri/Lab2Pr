import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC,90,100);
    }
    @Override
    public void applyOppEffects(Pokemon opp){
        opp.setMod(Stat.SPECIAL_ATTACK,-1);
    }
    @Override
    protected String describe(){
        return "stroke";

    }
}
