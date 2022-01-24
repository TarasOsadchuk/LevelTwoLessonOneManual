package com.geekbrains;

import com.geekbrains.actions.Motion;
import com.geekbrains.actions.PassingObstacles;
import com.geekbrains.obstacles.Obstacle;
import com.geekbrains.obstacles.Treadmill;
import com.geekbrains.obstacles.Wall;
import com.geekbrains.partaker.Cat;
import com.geekbrains.partaker.Human;
import com.geekbrains.partaker.Robot;

public class Main {

    /**
    1.  Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
    2.  Создайте два класса: беговая дорожка и стена, при прохождении через которые,
        участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем
        в консоль (успешно пробежал, не смог пробежать и т.д.).
    3.  Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
    4.  * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
     */

    public static void main(String[] args) {

        // создаю участников
        Human humanTaras = new Human(10, 10);
        Cat catTom = new Cat(5, 15);
        Robot robotValli = new Robot(15, 30);

        // создаю прегради
        Treadmill treadmill = new Treadmill(5);
        Wall wall = new Wall(10);
        Treadmill treadmill1 = new Treadmill(15);

        // делаю из них массив
        Motion[] motions = {humanTaras, catTom, robotValli};
        Obstacle[] obstacles = {treadmill, wall, treadmill1};

        // заставляю участников перейти сквозь преграды
        System.out.println("\n\"Welcome to the Game!\"\n");
        PassingObstacles.runObstacleCourse(obstacles, motions);
    }
    /*
     Создаю комментарии на русском так как, делаю их для себя и преподавателя.
     Весь проект старался делать с папками, для лучшей читаемости.
     Taras Osadchuk – Факультет «Geek University Java – разработки» І четверть.
     */
}