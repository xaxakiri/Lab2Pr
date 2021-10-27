import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{

    public Confide(){
        super(Type.NORMAL,0,0);

    }
    @Override
    public void applyOppEffects(Pokemon opp){
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK,-1).turns(-1).chance(0.3);
        if(e.success()){
            opp.addEffect(e);
        }
    }
    @Override
    protected String describe(){
        return "used Confide";
    }
}
