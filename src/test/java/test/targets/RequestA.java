package test.targets;

import com.yellowaxe.log.Classifications;
import com.yellowaxe.log.ClassifyAs;

public class RequestA {

    private final String unmarkedValue;

    @ClassifyAs(Classifications.UNCLASSIFIED)
    private final String simpleValue;

    @ClassifyAs(Classifications.SECRET)
    private final String sensitiveValue;

    public RequestA(String unmarkedValue, String simpleValue, String sensitiveValue) {
        this.unmarkedValue = unmarkedValue;
        this.simpleValue = simpleValue;
        this.sensitiveValue = sensitiveValue;
    }

    public String getUnmarkedValue() {
        return unmarkedValue;
    }

    public String getSimpleValue() {
        return simpleValue;
    }

    public String getSensitiveValue() {
        return sensitiveValue;
    }
}
