/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotgame2;

import java.util.*;

/**
 *
 * @author Dil Bdr
 */
public class RobotList {

    private ArrayList<Robot> R1;
    private int width, height;
    private Player p1;
    private static final int num = 3;
    private static final int fuel = 10;
/**
 * 
 * @param player is player object
 * @param width of the game board
 * @param height of the game board
 */
    public RobotList(Player player, int width, int height) {
        this.R1 =  new ArrayList<> ();
        this.width = width;
        this.height = height;
        this.p1 = player;

        int randomX = (int) (Math.random() * width + 0);
        Robot r1 = new Robot(randomX, (height - 1), fuel, p1);
        R1.add(r1);
    }
/**
 * move the robots as per the movement of player
 */
    public void moveAll() {

        for (int i = 0; i < R1.size(); i++) {
            R1.get(i).move();
        }

    }
/**
 * generate random robot and check if the random robot is equal to the random number that I have guessed.
 * 
 */
    public void randomGenerate() {
        int random = (int) (Math.random() * 4 + 0);
        if (random == this.num) {
            int randomX = (int) (Math.random() * width + 0);
            Robot r1 = new Robot(randomX, (height - 1), fuel, p1);
            R1.add(r1);
        }
    }
/**
 * 
 * @param x is the coordinate of robot
 * @param y is the coordinate of robot
 * @return true if temporary robot is equals to any robot in the board. 
 */
    public boolean isRobot(int x, int y) {
        Robot temporary = new Robot(x, y, 1, p1);
        for (int i = 0; i < R1.size(); i++) {
            if (R1.get(i).equals(temporary)) {
                return true;
            }
        }
        return false;
    }
}
