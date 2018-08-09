package command;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class ShrinkSpell extends Command {
    private Target target;

    @Override
    public void execute(Target target) {
        target.setSize(Size.SMALL);
        this.target = target;
    }

    @Override
    public void undo() {
        if(target != null){
            target.setSize(Size.NORMAL);
        }
    }

    @Override
    public void redo() {
        if(target != null){
            target.setSize(Size.SMALL);
        }
    }

    @Override
    public String toString() {
        return "Shrink spell";
    }
}
