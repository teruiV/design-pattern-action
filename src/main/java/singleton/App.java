package singleton;

/**
 * @author jianweilin
 * @date 2018/8/8
 */
public class App {

    public static void main(String[] args) {
        IvoryTower ivoryTower1 = IvoryTower.getInstance();
        IvoryTower ivoryTower2 = IvoryTower.getInstance();
        System.out.println(String.format("ivoryTower1 = %s,\nivoryTower2 = %s\n", ivoryTower1, ivoryTower2));

        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        ThreadSafeLazyLoadedIvoryTower threadSafeLazyLoadedIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
        System.out.println(String.format("threadSafeLazyLoadedIvoryTower1 = %s,\nthreadSafeLazyLoadedIvoryTower2 = %s\n", threadSafeLazyLoadedIvoryTower1, threadSafeLazyLoadedIvoryTower2));

        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking1 = ThreadSafeDoubleCheckLocking.getInstantce();
        ThreadSafeDoubleCheckLocking threadSafeDoubleCheckLocking2 = ThreadSafeDoubleCheckLocking.getInstantce();
        System.out.println(String.format("threadSafeDoubleCheckLocking1 = %s,\nthreadSafeDoubleCheckLocking2 = %s\n", threadSafeDoubleCheckLocking1, threadSafeDoubleCheckLocking2));

        InitializingOnDemandHolder initializingOnDemandHolder1 = InitializingOnDemandHolder.getInstance();
        InitializingOnDemandHolder initializingOnDemandHolder2 = InitializingOnDemandHolder.getInstance();
        System.out.println(String.format("initializingOnDemandHolder1 = %s,\ninitializingOnDemandHolder2 = %s\n", initializingOnDemandHolder1, initializingOnDemandHolder2));

        // enum singleton
        EnumlvoryTower enumlvoryTower1 = EnumlvoryTower.INSTANCE;
        EnumlvoryTower enumlvoryTower2 = EnumlvoryTower.INSTANCE;
        System.out.println(String.format("enumlvoryTower1 = %s,\nenumlvoryTower2 = %s\n", enumlvoryTower1, enumlvoryTower2));



    }
}
