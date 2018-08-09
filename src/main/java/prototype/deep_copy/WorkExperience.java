package prototype.deep_copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jianweilin
 * @date 2018/8/4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience implements Cloneable{
    private String workDate;
    private String company;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
