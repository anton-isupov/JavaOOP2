package com.netcracker.ball;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;


    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float) (speed * Math.cos(direction));
        yDelta = (float) ((-1) * speed * Math.sin(direction));
    }


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }


    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = this.xDelta * (-1);
    }

    public void reflectVertical() {
        this.yDelta = this.yDelta * (-1);
    }

    @Override
    public String toString() {
        return "Ball[" +
                "x = (" + x +
                ", y =" + y + ") " +
                "speed = (" + xDelta +
                ", " + yDelta + ") " +
                ']';
    }
}
