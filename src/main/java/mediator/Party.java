package mediator;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public interface Party {
    void addMember(PartyMember member);

    void act(PartyMember actor,Action action);
}
