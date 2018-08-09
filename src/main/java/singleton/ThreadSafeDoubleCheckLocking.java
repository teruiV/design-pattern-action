package singleton;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class ThreadSafeDoubleCheckLocking {
    private static volatile ThreadSafeDoubleCheckLocking instantce;

    private ThreadSafeDoubleCheckLocking() {
        if(instantce != null){
            throw new IllegalArgumentException("Already initialized.");
        }
    }

    public static ThreadSafeDoubleCheckLocking getInstantce(){
        ThreadSafeDoubleCheckLocking result = instantce;
        if(result == null){
            synchronized (ThreadSafeDoubleCheckLocking.class){
                result = instantce;
                if(result == null){
                    instantce = result = new ThreadSafeDoubleCheckLocking();
                }
            }
        }
        return result;
    }
}
