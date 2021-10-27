import ru.ifmo.se.pokemon.*;

public class Psybeam extends SpecialMove {
    public Psybeam(){
        super(Type.PSYCHIC,65,100);
    }
    private boolean flag;
    @Override
    public void applyOppEffects(Pokemon opp){
        if(Math.random()<=0.1){
            Effect.confuse(opp);
            flag = true;
        }
        else flag = false;
    }
    @Override
    protected String describe(){
        if(flag) return "hurt and confused";
        else return "hurt";
    }
}
