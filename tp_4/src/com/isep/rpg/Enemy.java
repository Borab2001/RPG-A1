package com.isep.rpg;

public abstract class Enemy {
    protected int lifePoints;
    protected int damage;

    // Getters/setters
    public void setLifePoints(int lifePoints) { this.lifePoints = lifePoints; };
    public int getLifePoints() { return lifePoints; };
    public int getDamage() { return damage; };
}
