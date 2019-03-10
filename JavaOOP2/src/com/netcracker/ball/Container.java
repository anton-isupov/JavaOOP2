package com.netcracker.ball;

public class Container {

    private int x1;
    private int x2;
    private int y1;
    private int y2;


    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return Math.abs(x2- x1);
    }

    public int getHeight() {
        return Math.abs(y2 - y1);
    }

    public boolean collides(Ball ball) {
        if (ball.getX() + ball.getRadius() / 2 <= x2 && ball.getY() + ball.getRadius() / 2 <= y2)
            return true;
        return false;
    }

}
