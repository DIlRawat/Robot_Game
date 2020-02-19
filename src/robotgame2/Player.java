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
public class Player {

    private int x, y, width, height;
    int HitCounter = 0;
// constructor 
    public Player(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     *
     * @return the x coordinate of player
     */
    public int getX() {
        return this.x;
    }

    /**
     *
     * @return y coordinate of player
     */
    public int getY() {
        return this.y;
    }

    /**
     *
     * @param direction reflects where to move the player.
     */
    public void move(String direction) {

        if (direction == "north" && y < height - 1) {
            y++;
        } else if (direction == "south" && y > 0) {
            y--;
        } else if (direction == "east" && x < width - 1) {
            x++;
        } else if (direction == "west" && x > 0) {
            x--;
        }
    }
/**
 * hit counter is increased by 1 whenever player hits robot
 */
    public void hit() {
        HitCounter++;
    }
/**
 * 
 * @return the number of times player get hits
 */
    public int getHits() {
        return this.HitCounter;

    }

}
