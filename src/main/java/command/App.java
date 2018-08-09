package command;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class App {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Goblin goblin = new Goblin();

        goblin.printStatus();
        wizard.castSpell(new ShrinkSpell(),goblin);
        goblin.printStatus();

        wizard.castSpell(new InvisibilitySpell(),goblin);
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.redoLastShell();
        goblin.printStatus();

        wizard.redoLastShell();
        goblin.printStatus();
    }
}
