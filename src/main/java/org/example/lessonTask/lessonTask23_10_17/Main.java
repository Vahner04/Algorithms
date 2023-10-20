package org.example.lessonTask.lessonTask23_10_17;

import static org.example.lessonTask.lessonTask23_10_17.Main.Ball.ballPly;

public class Main {
    public static void main(String[] args) {
        // На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать по ним вниз,
        //                                      к основанию.
        //Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
        //(То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
        //Определить число всевозможных «маршрутов» мячика с вершины на землю.
        int N = 8;
        int routes = ballPly(N);
        System.out.println(routes);
    }

    public class Ball {
       public static int ballPly(int i){
           if (i <= 1){
               return 1;
           }
           return ballPly(i - 1) + ballPly(i - 2) + ballPly(i - 3);
       }
    }
}
