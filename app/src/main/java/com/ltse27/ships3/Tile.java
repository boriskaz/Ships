package com.ltse27.ships3;

/**
 * Created by ltse27 on 11.06.15.
 */
public class Tile {
    public boolean isShip = false;
    public boolean isHit = false;
    public boolean isDestroyed = false;

    public boolean getIsShipStatus() {
        return isShip;
    }

    public void getIsShipStatus(boolean isShip) {
        this.isShip = isShip;
    }

    public boolean getIsHitStatus() {
        return isHit;
    }

    public void setIsHitStatus(boolean isHit) {
        this.isHit = isHit;
    }

    public boolean getIsDestroyedStatus() {
        return isDestroyed;
    }

    public void setIsDestroyedStatus(boolean isDestroyed) {
        this.isDestroyed = isDestroyed;
    }

}
