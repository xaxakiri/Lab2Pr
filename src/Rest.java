import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{

    public Rest(){
        super(Type.NORMAL,0,0);

    }
    @Override
    public void applySelfEffects(Pokemon att){
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        att.restore();
        att.addEffect(e);
    }
    @Override
    protected String describe(){
        return "rests";
    }
}
