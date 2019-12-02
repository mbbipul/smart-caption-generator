package com.smartcaptiongenerator.modelhelpers;

public interface Classifier {
    String name();

    Classification recognize(final float[] pixels);
}
