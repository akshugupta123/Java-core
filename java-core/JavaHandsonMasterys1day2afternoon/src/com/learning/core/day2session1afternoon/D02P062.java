package com.learning.core.day2session1afternoon;

class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

public class D02P062 {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public D02P062(String playerName, float critic1, float critic2) throws NotEligibleException {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.avgRating = calculateAverageRating(critic1, critic2);
        this.coins = calculateCoins();
    }

    public D02P062(String playerName, float critic1, float critic2, float critic3) throws NotEligibleException {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        this.avgRating = calculateAverageRating(critic1, critic2, critic3);
        this.coins = calculateCoins();
    }

    private float calculateAverageRating(float critic1, float critic2) {
        return (critic1 + critic2) / 2;
    }

    private float calculateAverageRating(float critic1, float critic2, float critic3) {
        return (critic1 + critic2 + critic3) / 3;
    }

    private String calculateCoins() throws NotEligibleException {
        if (avgRating >= 7) {
            return "Gold";
        } else if (avgRating >= 5) {
            return "Silver";
        } else if (avgRating >= 2) {
            return "Copper";
        } else {
            throw new NotEligibleException("Player is not eligible for any coin");
        }
    }

    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Average Rating: " + avgRating);
        System.out.println("Coins: " + coins);
    }

    public static void main(String[] args) {
        try {
            // Creating CricketRating objects with two critics
            D02P062 player1 = new D02P062("John", 8.5f, 7.0f);
            D02P062 player2 = new D02P062("Alice", 6.0f, 6.5f);

            // Creating CricketRating objects with three critics
            D02P062 player3 = new D02P062("Bob", 9.0f, 8.5f, 8.0f);
            D02P062 player4 = new D02P062("Carol", 5.0f, 4.0f, 3.5f);

            // Displaying information about the players
            player1.display();
            player2.display();
            player3.display();
            player4.display();
        } catch (NotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
