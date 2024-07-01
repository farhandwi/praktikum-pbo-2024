package com.praktikum;
public class Enemy {
    protected String name;
    protected double blood;
    protected double mana;
    protected double attack;

    public void setAttack(double attack){
        this.attack = attack;
    }

    public double getAttack(){
        return this.attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setEnemey(String type){
        if(type.equals("Colossal Titan")){
            this.name = "Colossal Titan";
            this.blood = 40;
            this.mana = 20;
            this.attack = 5;
        }else if(type.equals("Founding Titan")){
            this.name = "Founding Titan";
            this.blood = 60;
            this.mana = 25;
            this.attack = 10;
        }
    }

    public void display(Enemy enemy){
        System.out.println("======Enemy Identity======");
        System.out.println("Enemy Name : " + enemy.name);
        System.out.println("Enemy Blood : " + enemy.blood);
        System.out.println("Enemy mana : " + enemy.mana);
        System.out.println("Enemy Attack Power : " + enemy.attack);
    }

}
