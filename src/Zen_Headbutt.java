import ru.ifmo.se.pokemon.*;

public class Zen_Headbutt extends PhysicalMove {
    public Zen_Headbutt(){
        super(Type.PSYCHIC,80,90);
    }
    private boolean flag;
    @Override
    public void applyOppEffects(Pokemon opp){
        if(Math.random()<=0.2){
            Effect.flinch(opp);
            flag = true;
        }
        else flag = false;
    }
    @Override
    protected String describe(){
        if(flag) return "kicked and feared";
        else return "kicked";
    }
}
