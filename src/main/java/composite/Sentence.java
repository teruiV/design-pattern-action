package composite;

import java.util.List;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class Sentence extends LetterComposite {
    public Sentence(List<Word> words) {
        for (Word w: words){
            this.add(w);
        }
    }

    @Override
    protected void printThisAfter() {
        System.out.println(".");
    }
}
