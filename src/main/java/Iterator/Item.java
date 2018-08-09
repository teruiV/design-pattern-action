package Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
@Data
@AllArgsConstructor
public class Item {
    private ItemType itemType;
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
