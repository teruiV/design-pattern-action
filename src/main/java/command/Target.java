package command;

import lombok.Data;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
@Data
public abstract class Target {
    private Size size;
    private Visibility visibility;

    @Override
    public abstract String toString();

    public void printStatus(){
        System.out.println(String.format("%s,size=%s,visibility=%s\n",this,this.size,this.visibility));
    }
}
