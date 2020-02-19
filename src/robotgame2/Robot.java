/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotgame2;

/**
 *
 * @author Dil Bdr
 */
public class Robot {

    private int x, y, fuel;

    Player player;
    public boolean exploded;

    /**
     * 
     * @param x coordinate of robot 
     * @param y coordinate of robot
     * @param fuel of the robot 
     * @param player is the player object
     */
    public Robot(int x, int y, int fuel, Player player) {

        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.player = player;
        exploded = false;

    }
/**
 * if the robot is not exploded and fuel is greater than 0. 
 * The robot moves depending upon the coordinates of player. 
 */
    public void move() {
        if (exploded) {
            return;
        }
        if (fuel > 0) {

            if (this.x > player.getX()) {
                x--;
            } else if (this.x < player.getX()) {
                x++;
            }
            if (this.y > player.getY()) {
                y--;
            } else if (this.y < player.getY()) {
                y++;
            }
            fuel--;

            if ((player.getX() == this.x) && (player.getY() == this.y)) {
                player.hit();
                exploded = true;
            }
        }
    }
/**
 * 
 * @param obj is the robot object
 * @return true if the robot objects is equals to the object passed and if robot is not exploded
 */
    public boolean equals(Object obj) {
        if (obj instanceof Robot) {
            Robot r = (Robot) obj;
            if (!exploded && (r.x == x && r.y == y)) {
                return true;
            }
        }
        return false;

    }
}
