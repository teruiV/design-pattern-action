package chain;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
public class App {
    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE,"defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER,"torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAXÒ,"collect tax"));
    }
}
