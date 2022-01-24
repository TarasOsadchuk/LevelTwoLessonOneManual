package com.geekbrains.actions;

import com.geekbrains.obstacles.Treadmill;
import com.geekbrains.obstacles.Wall;

public interface Motion {
    // пишу интерфейс от для бега и прыжка
    // (нужно дня человек кота и робота), и для создания массива
    boolean run(Treadmill treadmill);

    boolean jump(Wall wall);
}