package mediator;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public interface PartyMember {
    void joinedParty(Party party);

    void partyAction(Action action);

    void act(Action action);
}
