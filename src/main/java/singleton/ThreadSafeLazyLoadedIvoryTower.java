package singleton;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class ThreadSafeLazyLoadedIvoryTower {
    private static ThreadSafeLazyLoadedIvoryTower instance;

    private ThreadSafeLazyLoadedIvoryTower() {
        if (instance != null) {
            throw new IllegalArgumentException("Already initialized");
        }
    }

    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }
        return instance;
    }
}
