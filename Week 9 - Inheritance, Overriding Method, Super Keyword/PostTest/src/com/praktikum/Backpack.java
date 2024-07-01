package com.praktikum;
public class Backpack extends Player{
    protected int potion;
    protected String[] items;

    public Backpack() {
        this.potion = 5;
        this.items = new String[10];
    }

    public String getItems(int i) {
        if(items[i] == ""){
            return "";
        }else{
            return items[i];
        }
    }

    public void setItems(String items, int i) {
        this.items[i] = items;
    }

    public int countLengthItems(){
        return this.items.length;
    }

    public void setPotion(int potion){
        this.potion = backpack.getPotion();
    }

    public int getPotion(){
        return this.potion;
    }

    public void usePotion(Player player, Backpack backpack){
        if(getPotion() != 0){
            player.blood += 50;
            player.mana += 10;
            backpack.potion -= 1;
            System.out.println("Poiton Used successfully!");
        }else if(getPotion() == 0){
            System.out.println("Potion is Empty!");
        }
    }

    public void openBackpack(Player player, Backpack backpack){
        System.out.println("****Data Information****");
        System.out.println("Blood\t= " + player.blood);
        System.out.println("Mana\t= " + player.mana);
        System.out.println("\nItems in Backpack");
        System.out.println("Potion\t= " + backpack.getPotion());
        for(int i = 1; i <= (backpack.countLengthItems()); i++){
            System.out.println(i + ". " + backpack.getItems(i-1));
        }
    }
}
