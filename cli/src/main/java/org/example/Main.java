package org.example;

public class Main {

    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.err.println("Usage: roll <dice_expression>");
            System.err.println("Example: roll 2d20");
            System.exit(1);
        }

        System.out.println(Dice.parseDiceNotation(args[0]));
    }
}