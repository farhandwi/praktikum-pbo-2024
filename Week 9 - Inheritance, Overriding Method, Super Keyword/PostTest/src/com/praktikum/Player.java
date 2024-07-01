package com.praktikum;
import java.util.Scanner;

public class Player {
    private String username;
    private String password;
    protected double blood;
    protected double mana;
    protected double level;
    protected double attack;

    public Backpack backpack;

    public double getAttack(){
        return this.attack;
    }

    public void setAttack(double attack){
        this.attack = attack;
    }

    public double getLevel(){
        return this.level;
    }

    public void setLevel(double level){
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBlood() {
        return blood;
    }

    public void setBlood(double blood) {
        this.blood = blood;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public void startingLevel(Player player){
        double level = this.level;
        if(level == 1){
            return;
        }else if(level > 1){
            player.attack += (level-1)*4;
            player.blood += (level-1)*10;
            player.mana += (level-1)*8;
        }

    }

    public void levelUP(Player player){
        System.out.println("Levels Up!");
        player.level += 1;
        startingLevel(player);
    }


    public void attacking(Player player, String typeEnemy){
        Enemy enemy = new Enemy();
        if(typeEnemy.equals("Founding Titan")){
            enemy.setEnemey("Founding Titan");
        }else if(typeEnemy.equals("Colossal Titan")){
            enemy.setEnemey("Colossal Titan");
        }
        Scanner inputUser = new Scanner(System.in);
        while (true) {
            System.out.println("Upss! Enemy founded");
            enemy.display(enemy);
            System.out.println("Your health: " + player.getBlood());
            System.out.println("1. Attack");
            System.out.println("2. Run");
            System.out.print("Enter your choice: ");
            int choice = inputUser.nextInt();
            switch(choice){
                case 1:
                    double getManaEnemy = player.getMana() - 4;
                    player.setBlood(getManaEnemy);
                    if(getManaEnemy <= 0){
                        player.setMana(0);
                        System.out.println("Your mana is Empty!");
                        break;
                    }else{
                        double attackingEnemy = enemy.getBlood() - player.getAttack();
                        enemy.setBlood(attackingEnemy);
                        System.out.println("You hit the enemy for " + player.attack + " damage");
                        if (enemy.getBlood() <= 0) {
                            System.out.println("You defeated the enemy!");
                            levelUP(player);
                            return;
                        }
                    }
                    double attackingPlayer = player.getBlood() - enemy.getAttack();
                    player.setBlood(attackingPlayer);
                    System.out.println("The enemy hit you for " + enemy.getAttack() + " damage");
                    if(player.getBlood() <= 0){
                        System.out.println("You died!");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("You ran away from the enemy");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}