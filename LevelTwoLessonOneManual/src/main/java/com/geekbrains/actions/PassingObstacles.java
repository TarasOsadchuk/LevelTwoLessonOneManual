package com.geekbrains.actions;

import com.geekbrains.obstacles.Obstacle;
import com.geekbrains.obstacles.Treadmill;
import com.geekbrains.obstacles.Wall;

public interface PassingObstacles {

    /**
     * Делаю логику для взаимодействия двоих массивов (преграды и участники)
     * самое тяжелое, что есть на этом уроке.
     * С решением помог один из однокурсников, большое ему спасибо!
     * Доходчиво объяснил, и указал на ошибки.
     */

    static void runObstacleCourse(Obstacle[] obstacles, Motion[] motions) {
        for (Motion motion : motions) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    if (!motion.run((Treadmill) obstacle)) break;
                } else {
                    if (!motion.jump((Wall) obstacle)) break;
                }
            }
        }
    }
}
