package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {

        SamsungHead samsungHead = new SamsungHead(800);
        SamsungHand samsungHand = new SamsungHand(200);
        SamsungLeg samsungLeg = new SamsungLeg(400);
        SonyHead sonyHead = new SonyHead(1_000);
        SonyHand sonyHand = new SonyHand(350);
        SonyLeg sonyLeg = new SonyLeg(500);
        ToshibaHead toshibaHead = new ToshibaHead(700);
        ToshibaHand toshibaHand = new ToshibaHand(150);
        ToshibaLeg toshibaLeg = new ToshibaLeg(350);

        Robot robot1 = new Robot("Anton", samsungHead, sonyHand, toshibaLeg);
        Robot robot2 = new Robot("Valera", sonyHead, toshibaHand, sonyLeg);
        Robot robot3 = new Robot("Natasha", toshibaHead, samsungHand, samsungLeg);

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();

        robot1.getPrice();
        robot2.getPrice();
        robot3.getPrice();

        Robot[] robots = new Robot[3];
        robots[0] = robot1;
        robots[1] = robot2;
        robots[2] = robot3;
        System.out.println("Самый дорогой робот - " + robots[findMostExpensive(robots)].getName());
    }

    public static int findMostExpensive(Robot[] robots) {
        int biggestPrice = robots[0].getPrice();
        int biggestPriceIndex = 0;
        for (int i = 0; i < robots.length; i++) {
            if (robots[i].getPrice() > biggestPrice) {
                biggestPrice = robots[i].getPrice();
                biggestPriceIndex = i;
            }
        }
        return biggestPriceIndex;
    }
}
 /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
