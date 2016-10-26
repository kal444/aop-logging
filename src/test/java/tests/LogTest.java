package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.targets.IService;
import test.targets.RequestA;
import test.targets.RequestB;
import test.targets.RequestC;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/spring-app-test.xml")
public class LogTest {

    @Autowired
    private IService target;

    @Test
    public void testLog() throws Exception {
        target.operationA(new RequestA("un", "simple", "sensitive"));
        target.operationB(new RequestB("un", "simple", "sensitive"));
        target.operationC(new RequestC("un", "simple", "sensitive"));
        target.operationP(100);
        target.operationV();
    }
}
