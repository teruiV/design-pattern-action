package command;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public abstract class Command {
    public abstract void execute(Target target);

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}
