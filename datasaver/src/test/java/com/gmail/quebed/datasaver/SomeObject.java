package com.gmail.quebed.datasaver;

import java.io.Serializable;

public class SomeObject implements Serializable {
    public int x = 0;
    public int y = 0;

    public SomeObject(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
