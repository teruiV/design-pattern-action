package singleton;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public final class InitializingOnDemandHolder {
    private InitializingOnDemandHolder() {
    }

    public static InitializingOnDemandHolder getInstance() {
        return HelperHolder.INSTANCE;
    }


    private static class HelperHolder {
        private static final InitializingOnDemandHolder INSTANCE = new InitializingOnDemandHolder();
    }
}
