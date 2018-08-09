package composite;

/**
 * 组合模式，非常赞的设计
 * @author jianweilin
 * @date 2018/8/7
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Message from the orcs: ");

        LetterComposite orcMessage = new Messager().messageFromOrcs();
        orcMessage.print();

        System.out.println("\nMessage from the elves: ");

        LetterComposite elfMessage = new Messager().messageFromElves();
        elfMessage.print();
    }
}
