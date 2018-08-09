package observe;

/**
 * @author jianweilin
 * @date 2018/8/6
 */
public enum WeatherType {
    SUNNY,RAINY,WINDY,COLD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
