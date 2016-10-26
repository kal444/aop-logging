package test.targets;

import com.yellowaxe.log.ClassifyAs;

@ClassifyAs
public class RequestC extends RequestB {

    public RequestC(String unmarkedValue, String simpleValue, String sensitiveValue) {
        super(unmarkedValue, simpleValue, sensitiveValue);
    }
}
