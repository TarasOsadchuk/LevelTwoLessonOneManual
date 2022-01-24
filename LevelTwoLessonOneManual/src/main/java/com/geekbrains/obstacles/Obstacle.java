package com.geekbrains.obstacles;

public abstract class Obstacle {

    // создал абстрактный клас для преград
    protected int length;

    // делаю конструктор
    public Obstacle(int length) {
        this.length = length;
    }

    // и геттер
    public int getLength() {
        return length;
    }
}