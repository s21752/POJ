package com.orpuwupetup.zjazd2.shapes;

public class Kwadrat {

    private int x,y;

    public Kwadrat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int pole() {
        return x*y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
