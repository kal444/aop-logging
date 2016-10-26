package com.yellowaxe.log;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class ClassificationExclusionStrategy implements ExclusionStrategy {

    private static final Classifications allowedClassification = Classifications.UNCLASSIFIED;

    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        ClassifyAs annotation = fieldAttributes.getAnnotation(ClassifyAs.class);
        return annotation != null && annotation.value().exceeds(allowedClassification);
    }

    public boolean shouldSkipClass(Class<?> aClass) {
        ClassifyAs annotation = aClass.getAnnotation(ClassifyAs.class);
        return annotation != null && annotation.value().exceeds(allowedClassification);
    }
}
