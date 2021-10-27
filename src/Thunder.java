import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.PSYCHIC,110,70);
    }
    private boolean flag;
    @Override
    public void applyOppEffects(Pokemon opp){
        if(Math.random()<=0.3){
            Effect.paralyze(opp);
            flag = true;
        }
        else flag = false;
    }
    @Override
    protected String describe(){
        if(flag) return "lighted and paralyzed";
        else return "lighted";
    }
}