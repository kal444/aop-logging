package com.yellowaxe.log;

public enum Classifications {

    UNCLASSIFIED(0),
    CLASSIFIED(10),
    SECRET(20),
    TOPSECRET(30);

    private int level = 0;

    Classifications(int level) {
        this.level = level;
    }

    public int level() {
        return level;
    }

    public boolean exceeds(Classifications classifications) {
        return level() > classifications.level();
    }
}
