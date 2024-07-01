package com.praktikum;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    static int index = 0;
    static String[] usernames = new String[100];
    static String[] passwords = new String[100];
    static double[] bloods = new double[100];
    static double[] manas = new double[100];
    static double[] attacks = new double[100];
    static double[] levels = new double[100];
    static Player[] player = new Player[100];
    static int saveIndexPlayer;

    public static void main(String[] args) throws Exception{
        loadUsers();
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            cls();
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    login();
                    sleep();
                    break;
                case 2:
                    signUp();
                    loadUsers();
                    sleep();
                    break;
                case 3:
                    isRunning = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    static void login() throws Exception{
        try{
            Scanner inputuser = new Scanner(System.in);
            System.out.print("Enter your username: ");
            String username = inputuser.next();
            System.out.print("Enter your password: ");
            String password = inputuser.next();
            File file = new File("users.txt");
            Scanner Filescanner = new Scanner(file);
            int count = 0;
            while(Filescanner.hasNextLine()){
                String line = Filescanner.nextLine();
                String[] parts = line.split(",");
                count++;
            }
            Filescanner.close();
            for (int i = 0; i < count; i++){
                if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                    System.out.println("Login successful");
                    sleep();
                    cls();
                    saveIndexPlayer = i;
                    mainGame(player[i]);
                    bloods[i] = player[i].getBlood();
                    manas[i] = player[i].getMana();
                    attacks[i] = player[i].getAttack();
                    levels[i] = player[i].getLevel();
                    updateUsers();
                    return;
                }
            }
            System.out.println("Invalid username or password");
        }catch(Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void signUp() throws Exception{
        try{
            Scanner inputUser = new Scanner(System.in);
            File file = new File("users.txt");
            System.out.print("Enter a username: ");
            String username = inputUser.next();
            System.out.print("Enter a password: ");
            String password = inputUser.next();
            Scanner fileScanner = new Scanner(file);
            int userCount = 0;
            boolean check = false;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if(username.equals(parts[0])){
                    System.err.println("The username is already use!");
                    fileScanner.close();
                    sleep();
                    return;
                }
                userCount++;
            }
            fileScanner.close();
            check = true;
            if(check == true){
                Scanner scanner = new Scanner(System.in);
                usernames[userCount] = username;
                passwords[userCount] = password;
                System.out.print("choose your roles:\n1. Magicians\n2. Fighters\nYour choice:");
                int chooice = scanner.nextInt();
                if(chooice == 1){
                    Magician magic = new Magician();
                    bloods[userCount] = magic.blood;
                    manas[userCount] = magic.mana;
                    attacks[userCount] = magic.attack;
                    levels[userCount] = magic.level;
                }else if(chooice == 2){
                    Fighter fighter = new Fighter();
                    bloods[userCount] = fighter.blood;
                    manas[userCount] = fighter.mana;
                    attacks[userCount] = fighter.attack;
                    levels[userCount] = fighter.level;
                }
                saveUsers();
                System.out.println("Sign up successful");
            }
        }catch(Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    static void loadUsers() throws Exception{
        try {
            File file = new File("users.txt");
            int userCount = 0;
            if (file.createNewFile()) {
                System.out.println("New file created: " + file.getName());
            } else {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    player[userCount] = new Player();
                    String line = fileScanner.nextLine();
                    String[] parts = line.split(",");
                    player[userCount].setUsername(parts[0]);
                    player[userCount].setPassword(parts[1]);
                    double blood = Double.parseDouble(parts[2]);
                    player[userCount].setBlood(blood);
                    double mana = Double.parseDouble(parts[3]);
                    player[userCount].setMana(mana);
                    double attack = Double.parseDouble(parts[4]);
                    player[userCount].setAttack(attack);
                    double level = Double.parseDouble(parts[5]);
                    player[userCount].setLevel(level);
                    usernames[userCount] = parts[0];
                    passwords[userCount] = parts[1];
                    bloods[userCount] = blood;
                    manas[userCount] = mana;
                    attacks[userCount] = attack;
                    levels[userCount] = level;
                    userCount++;
                }
                fileScanner.close();
            }
        } catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void saveUsers() {
        try {
            File file = new File("users.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                count++;
            }
            scanner.close();
            FileWriter writer = new FileWriter("users.txt");
            for (int i = 0; i <= count; i++) {
                writer.write(usernames[i] + "," + passwords[i] + "," + bloods[i] + "," + manas[i] + "," + attacks[i] + "," + levels[i] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void updateUsers() {
        try {
            File file = new File("users.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                count++;
            }
            scanner.close();
            FileWriter writer = new FileWriter("users.txt");
            for (int i = 0; i < count; i++) {
                writer.write(usernames[i] + "," + passwords[i] + "," + bloods[i] + "," + manas[i] + "," + attacks[i] + "," + levels[i] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void mainGame(Player player){
        boolean isRunning = true;
        Scanner inGame = new Scanner(System.in);
        player.backpack = new Backpack();
        while (isRunning) {
            cls();
            System.out.println("1. Open backpack");
            System.out.println("2. Start Adventure");
            System.out.println("3. Use potion");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = inGame.nextInt();
            switch (choice) {
                case 1:
                    openBackpack(player, player.backpack);
                    sleep();
                    break;
                case 2:
                    startAdventure(player);
                    break;
                case 3:
                    player.backpack.usePotion(player, player.backpack);
                    sleep();
                    break;
                case 4:
                    bloods[saveIndexPlayer] = player.getBlood();
                    manas[saveIndexPlayer] = player.getMana();
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    static void openBackpack(Player player, Backpack backpack) {
        Scanner inputUser = new Scanner(System.in);
        boolean isLanjut = true;
        String option;
        while(isLanjut){
            player.backpack.openBackpack(player, backpack);
            System.out.print("Back to games(yes/no) ? ");
            option = inputUser.next();
            switch(option){
                case "yes":
                    isLanjut = false;
                    break;
                case "no":
                    isLanjut = true;
                    break;
                default:
                    System.out.println("Maaf inputan anda salah!");
                    break;
            }
        }
    }

    static void startAdventure(Player player) {
        System.out.println("you have entered the game, please explore as much as possible !");
        sleep();
        int choiceWay;
        Scanner inputEnemy = new Scanner(System.in);
        while (true) {
            cls();
            System.out.println("Your health: " + player.getBlood());
            System.out.println("Your Mana: " + player.getMana());
            System.out.println("Your Level: " + player.getLevel());
            System.out.println("1. Go straight");
            System.out.println("2. Move right");
            System.out.println("3. move left");
            System.out.println("4. Exit Game");
            System.out.print("Enter your choice: ");
            int choice = inputEnemy.nextInt();
            switch (choice) {
                case 1:
                    choiceWay = 1 + (int)( Math.random() * 10);
                    determineCourseOfGame(player, choiceWay);
                    sleep();
                    break;
                case 2:
                    choiceWay = 1 + (int)( Math.random() * 10);
                    determineCourseOfGame(player, choiceWay);
                    sleep();
                    break;
                case 3:
                    choiceWay = 1 + (int)( Math.random() * 10);
                    determineCourseOfGame(player, choiceWay);
                    sleep();
                    break;
                case 4:
                    System.out.println("You exit roaming!");
                    sleep();
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    static public void determineCourseOfGame(Player player, int pilihan){
        if(pilihan == 1){
            if(index >= 9){
                System.out.println("Your Backpack is Full!");
                sleep();
            }else{
                player.backpack.setItems("Grass", index);
                System.out.println("You got a Item : Grass");
                index++;
                sleep();
            }
            return;
        }else if(pilihan == 2){
            player.attacking(player, "Colossal Titan");
            sleep();
            return;
        }else if(pilihan == 3){
            player.attacking(player, "Founding Titan");
            sleep();
            return;
        }else if(pilihan == 4){
            if(index >= 9){
                System.out.println("Your Backpack is Full!");
                sleep();
            }else{
                player.backpack.setItems("Rice", index);
                System.out.println("You got a Item : Rice");
                index++;
                sleep();
            }
            return;
        }else if(pilihan == 5){
            player.attacking(player, "Founding Titan");
            sleep();
            return;
        }else if(pilihan == 6){
            System.out.println("there is nothing here!");
            sleep();
            return;
        }else if(pilihan == 7){
            player.attacking(player, "Colossal Titan");
            sleep();
            return;
        }else if(pilihan == 8){
            System.out.println("there is nothing here!");
            sleep();
            return;
        }else if(pilihan == 9){
            player.attacking(player, "Colossal Titan");
            sleep();
            return;
        }else if(pilihan == 10){
            player.attacking(player, "Colossal Titan");
            sleep();
            return;
        }
    }


    public static void cls(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E){
            System.out.println(E);
        }
    }

    public static void sleep(){
        try{
            Thread.sleep(1000);
        }catch(Exception E){}
    }
}