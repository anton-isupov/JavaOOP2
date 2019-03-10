package com.netcracker.ball;

public class Main {

    public static void main(String[] args) {

        Container container = new Container(0,0, 20,20);

        Ball ball = new Ball(10,10,5,10,180);
        System.out.println(container.collides(ball));

        ball.move();
        System.out.println(container.collides(ball));

        ball.reflectHorizontal();
        ball.reflectVertical();
        ball.move();
        System.out.println(container.collides(ball));

    }
}
