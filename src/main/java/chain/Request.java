package chain;

import lombok.Data;

/**
 * @author jianweilin
 * @date 2018/8/9
 */
@Data
public class Request {
    private final RequestType requestType;

    private final String requestDescription;

    private boolean handled;

    public Request(final RequestType requestType, final String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    public void markHandled(){
        this.handled = true;
    }

    public boolean isHandled(){
        return this.handled;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
