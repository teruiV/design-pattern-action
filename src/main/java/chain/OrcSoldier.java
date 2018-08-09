package chain;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class OrcSoldier extends RequestHandler{
    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.COLLECT_TAXÒ)) {
            printHandling(req);
            req.markHandled();
        }else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc Soldier";
    }
}
