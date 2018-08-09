package composite;

import java.util.List;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class Word extends LetterComposite {
    public Word(List<Letter> letters) {
        for(Letter l : letters){
            this.add(l);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
