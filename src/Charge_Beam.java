import ru.ifmo.se.pokemon.*;

public class Charge_Beam extends SpecialMove {
    public Charge_Beam(){
        super(Type.ELECTRIC,50,90);
    }
    @Override
    public void applySelfEffects(Pokemon opp){
        Effect e = new Effect().chance(0.7).turns(-1).stat(Stat.SPECIAL_ATTACK,1);
        if(e.success()){
            opp.addEffect(e);
        }
    }
    @Override
    protected String describe(){
        return "used Charge Beam";

    }
}
