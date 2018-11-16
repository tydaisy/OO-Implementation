package towerdefence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * The DisplayGame class is to illustrate the process of showing the interface
 * of this game.
 * 
 * @author CS5001 Yao Tong (cs5001.yt27@st-andrews.ac.uk)
 * @version 1
 * @since 19th October, 2017
 */
public class DisplayGame {

    static void display() {

        // store the position and the name of every tower
        ArrayList<Integer> towerList = new ArrayList<Integer>();
        HashMap<Integer, String> towerMap = new HashMap<Integer, String>();

        for (int i = 0; i < Game.towers.size(); i++) {

            System.out.println(Game.towers.get(i).toString()); //

            String name = Game.towers.get(i).getName();
            int position = Game.towers.get(i).getPosition();

            towerMap.put(position, name);
            towerList.add(position);
        }

        Collections.sort(towerList);

        // put every tower in desired position
        for (int x = 0; x < Game.corridorLength; x++) {
            if (towerList.size() > 0) {

                if (x == towerList.get(0)) {

                    if (towerMap.get(x).equals("Slingshot")) {
                        System.out.print("S");
                    } else {
                        System.out.print("C");
                    }

                    towerList.remove(0);
                } else {
                    System.out.print("#");
                }

            } else {
                System.out.print("#");
            }

        }
        System.out.println();

        // display the positions of enemies
        for (int i = 0; i < Game.enemies.size(); i++) {
            // System.out.println(Game.enemies.get(i).toString());

            String name = Game.enemies.get(i).getName();
            int position = Game.enemies.get(i).getPosition();

            for (int x = 0; x < Game.corridorLength; x++) {
                if (x == position) {

                    if (name == "Rat") {
                        System.out.print("R");
                    } else {
                        System.out.print("E");
                    }

                } else {
                    System.out.print("~");
                }
            }
            System.out.println();

        }

        // add "#" until reaching the end of the corridor
        for (int x = 0; x < Game.corridorLength; x++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
