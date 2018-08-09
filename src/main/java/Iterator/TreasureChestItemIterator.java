package Iterator;

import java.util.List;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class TreasureChestItemIterator implements ItemIterator {
    private TreasureChest chest;
    private int idx;
    private ItemType itemType;

    public TreasureChestItemIterator(TreasureChest chest, ItemType itemType) {
        this.chest = chest;
        this.idx = -1;
        this.itemType = itemType;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Item next() {
        idx = findNextIdx();
        if(idx != -1){
            return chest.getItems().get(idx);
        }
        return null;
    }

    private int findNextIdx(){
        List<Item> items = chest.getItems();
        boolean found = false;
        int tempIdx = idx;
        while (!found){
            tempIdx++;
            if(tempIdx >= items.size()){
                tempIdx = -1;
                break;
            }

            if(itemType.equals(ItemType.ANY) || items.get(tempIdx).getItemType().equals(itemType)){
                break;
            }
        }
        return tempIdx;
    }
}
