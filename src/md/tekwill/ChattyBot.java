package md.tekwill;

import java.util.Scanner;

public class ChattyBot {
    public static void main(String[] args) {
        //Hello message from Chatty-bot
        System.out.println("\uD83D\uDC4B Hello there friend! \uD83D\uDC4B");
        System.out.println("\uD83E\uDD16 I'm named the Chatty-Bot!");
        System.out.println("\uD83D\uDE0D I was created during the Java Fundamentals Course of March-June 2021. Born during COVID pandemic! Can you believe that? \uD83D\uDE32");
        System.out.println("\n\uD83E\uDD14 So friend, can you remind me your name?");

        //Chatty-bot ask the the user enter the name
        Scanner input1 = new Scanner(System.in);
        String name = input1.nextLine();
        System.out.println("This is a wonderful name you have there, " + name + "!");

        //Chatty-bot calculate the age
        System.out.println("\nBelive it or not, but I can guess your age!");
        System.out.println("\uD83E\uDD14 Say me the reminders of dividing your age by 3, 5 and 7: ");
        Scanner input2 = new Scanner(System.in);
        int a = input2.nextInt();
        int b = input2.nextInt();
        int c = input2.nextInt();
        //32%3=2 32%5=2 32%7=4
        int userAge = (a * 70 + b * 21 + c * 15) % 105;
        System.out.println(name + "! Using magic I guess, your age is " + userAge + "!");
        System.out.println("\uD83D\uDE10 But I'm a simple bot, and I might be wrong. \uD83D\uDE04\n");

        //Chatty-bot ask to enter the real age
        System.out.println("Tell me your real age, and let's see if my guess is right:");
        for (int realAge = input2.nextInt(); realAge != userAge; realAge = input2.nextInt()) {
            if (realAge > 100) {
                System.out.println("Heeeey, somebody must be joking here. you can't be that old! Please try again!");
            } else if (realAge <= 0) {
                System.out.println("Heeeey, somebody must be joking here. you can't be that young! Please try again!");
            } else {
                System.out.println("Ohh! Sorry Jonny, I'm still learning. I hope you still belive in magic!");
            }
            System.out.println("Tell me your real age, and let's see if my guess is right:");
        }
        System.out.println("\uD83D\uDE04Yaaay! In the end, I'm still capable of doing something! \uD83D\uDE0D");


        System.out.println("\nSo, " + name + ", your age is " + userAge + ". That's the most perfect time to learn programming!");

        //Chatty-bot ask the user to enter the number when to stop
        System.out.println("\nYou know what else I can do? I can count to any number you want! Tell me when to stop: ");
        int nbrStop = input2.nextInt();
        for (int i = 0; i <= nbrStop; i++) {
            System.out.println(i + "!");
        }

        //Chatty-bot give question and check response
        System.out.println("Lets test your programming knowledge.\nWhy do you use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        for (int userResponse = input2.nextInt(); userResponse != 2; userResponse = input2.nextInt()) {
            System.out.println("\uD83D\uDE1E Please try again.");
        }
        System.out.println("Heeeey " + name + " you're right! But it's time for me to go to sleep. Wake me up later when you're bored!");
    }
}
