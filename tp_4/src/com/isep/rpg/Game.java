package com.isep.rpg;

public class Game {
    protected Hero[] heroes;

    public void playGame() {
        int numberOfHeroes = selectNumberOfHeroes();
        createHeroes(numberOfHeroes);
        generateCombat();
    }


    public void generateCombat() {
        // Play until all players are dead
        while (isAPlayerAlive()) {
            Enemy enemy = generateRandomEnemy();
            enemy.setLifePoints(4);
        }
    }
}
