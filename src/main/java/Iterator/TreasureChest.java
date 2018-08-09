package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jianweilin
 * @date 2018/8/7
 */
public class TreasureChest {
    private List<Item> items;

    public TreasureChest() {
        items = new ArrayList<>();
        items.add(new Item(ItemType.POTION, "Potion of courage"));
        items.add(new Item(ItemType.RING, "Ring of shadows"));
        items.add(new Item(ItemType.POTION, "Potion of wisdom"));
        items.add(new Item(ItemType.POTION, "Potion of blood"));
        items.add(new Item(ItemType.WEAPON, "Sword of silver +1"));
        items.add(new Item(ItemType.POTION, "Potion of rust"));
        items.add(new Item(ItemType.POTION, "Potion of healing"));
        items.add(new Item(ItemType.RING, "Ring of armor"));
        items.add(new Item(ItemType.WEAPON, "Steel halberd"));
        items.add(new Item(ItemType.WEAPON, "Dagger of poison"));
    }

    public List<Item> getItems(){
        List<Item> list = new ArrayList<>();
        list.addAll(items);
        return list;
    }

    public ItemIterator iterator(ItemType itemType){
        return new TreasureChestItemIterator(this,itemType);
    }
}
