package com.geekbrains.partaker;

import com.geekbrains.actions.Motion;
import com.geekbrains.obstacles.Treadmill;
import com.geekbrains.obstacles.Wall;

import java.util.InputMismatchException;

public class Cat implements Motion {

    // создаю переменные высоты прыжка и дальности бега
    private final int jumpHeight;
    private final int runLength;

    // создаю конструктор
    public Cat(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    //так как наследуюсь из интерфейса, то нужно задать параметры
    @Override
    public boolean run(Treadmill treadmill) {
        if (runLength >= treadmill.getLength()) {
            System.out.println("Cat run: " + treadmill.getLength() + "m.");
            return true;
        } else if (jumpHeight < 0) {
            throw new InputMismatchException("Invalid number");
        }
        return false;
    }

    // бег и прыжок (плюс забрал возможность сделать минусовое число)
    @Override
    public boolean jump(Wall wall) {
        if (jumpHeight >= wall.getLength()) {
            System.out.println("Cat jump: " + wall.getLength() + "m.");
            return true;
        } else if (runLength < 0) {
            throw new InputMismatchException("Invalid number");
        }
        return false;
    }
}