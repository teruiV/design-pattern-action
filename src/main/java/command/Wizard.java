package command;


import java.util.Deque;
import java.util.LinkedList;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class Wizard {
    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public Wizard() {
    }

    public void castSpell(Command command,Target target){
        System.out.println(String.format("%s cast %s at %s",this,command,target));
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell(){
        if(!undoStack.isEmpty()){
            Command previousShell = undoStack.pollLast();
            redoStack.offerLast(previousShell);
            System.out.println(String.format("%s undoes %s",this,previousShell));
            previousShell.undo();
        }
    }

    public void redoLastShell(){
        if(!redoStack.isEmpty()){
            Command previousShell = redoStack.pollLast();
            undoStack.addLast(previousShell);
            System.out.println(String.format("%s redo %s",this,previousShell));
            previousShell.redo();
        }
    }


    @Override
    public String toString() {
        return "Wizard";
    }
}
