package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long water = 400;
        long milk = 540;
        long coffee = 120;
        long dCups = 9;
        long money = 550;
        String action;
        boolean exit = false;
        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit) :");
            action = sc.nextLine();
            switch (action) {
                case "fill":
                    System.out.println();
                    System.out.println("Write how many ml of water do you want to add: ");
                    int mWater = sc.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int mMilk = sc.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int mCoffee = sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int mdCups = sc.nextInt();
                    //sc.nextLine();
                    water += mWater;
                    milk += mMilk;
                    coffee += mCoffee;
                    dCups += mdCups;
                    break;
                case "take":
                    System.out.println();
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println();
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffee + " of coffee beans");
                    System.out.println(dCups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String c = sc.nextLine();
                    switch (c) {
                        case "1":
                            if (water >= 250 && coffee >= 16) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                coffee -= 16;
                                money += 4;
                                dCups--;
                            } else {
                                String less = (water < 250) ? "water" : "beans";
                                System.out.println("Sorry, not enough " + less + "!");
                            }
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && coffee >= 20) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                coffee -= 20;
                                money += 7;
                                dCups--;
                            } else {
                                if (water < 350) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk < 75) {
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough beans!");
                                }
                            }
                            break;
                        case "3":
                            if (water >= 200 && milk >= 100 && coffee >= 12) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                coffee -= 12;
                                money += 6;
                                dCups--;
                            } else {
                                if (water < 200) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk < 100) {
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    System.out.println("Sorry, not enough beans!");
                                }
                            }
                            break;
                        case "back":
                            break;
                        default:
                            break;
                    }
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    break;
            }
        }

    }
}
