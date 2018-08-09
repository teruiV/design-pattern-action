package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class PartyImpl implements Party{
    private final List<PartyMember> members;

    public PartyImpl() {
        this.members = new ArrayList<>();
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinedParty(this);
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (PartyMember member: members){
            if(!member.equals(actor)){
                member.partyAction(action);
            }
        }
    }
}
