import ru.ifmo.se.pokemon.*;

public class Pound extends PhysicalMove {
    public Pound(){
        super(Type.NORMAL, 40, 100);
    }
    @Override
    protected String describe(){
        return "punched";
    }
}