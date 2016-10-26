package com.yellowaxe.log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class LogAspect {

    private static final Logger LOG = LogManager.getLogger(LogAspect.class);
    private static final Gson gson = new GsonBuilder().setExclusionStrategies(new ClassificationExclusionStrategy()).create();

    public Object log(ProceedingJoinPoint pjp) throws Throwable {

        Object[] args = pjp.getArgs();
        LOG.info(Arrays.toString(args));
        LOG.info(gson.toJson(args));

        Object retVal = pjp.proceed();
        LOG.info(String.valueOf(retVal));
        LOG.info(gson.toJson(retVal));

        return retVal;

    }
}
