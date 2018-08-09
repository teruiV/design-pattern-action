package chain;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class OrcKing {
    private RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req){
        chain.handleRequest(req);
    }
}
