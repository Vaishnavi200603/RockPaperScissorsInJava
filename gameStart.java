package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO GAME - ROCK PAPER SCISSORS");

        records.totalRecord();
        System.out.println("Game Start");

        boolean start = true;
        while(start){
            int ans = 0;
            //records.showRecords(ans);

            //user input
            System.out.print("Enter your input : ");
            String input = sc.next();
            input = input.toUpperCase();

            //System.out.println(input);

            //computer input
            //rockAscii = 82, paperAscii = 80, scissorsAscii = 83;
            int lowerLimit = 80;
            int upperLimit = 83;
            int targetStringLength = 1;
            int rnd = ThreadLocalRandom.current().nextInt(lowerLimit,upperLimit);
            while(rnd == 81){
                rnd = ThreadLocalRandom.current().nextInt(lowerLimit,upperLimit);
            }
            String randomNumber = "" + (char)rnd;
            //System.out.println(randomNumber);

            System.out.println("User Input : " + input);
            System.out.println("Computer Input : " + randomNumber);

            ans = RockPaperScissors.receiveInput(input,randomNumber);
            if(ans == 1){
                records.updateRecords(input,records.mp.get(input)+1);
                System.out.println("YOU WIN, COMPUTER LOSE");
            }
            else if(ans == -1){
                records.updateRecords(input,records.mp.get(input)-1);
                System.out.println("YOU LOSE, COMPUTER WIN");
            }
            else if(ans == -10){
                System.out.println("GAME OVER");
                start = false;
                return;
            }
            else{
                System.out.println("IT'S A TIE");
            }
            records.showRecords();

            System.out.println("----------------------------------------------------");

        }
    }
}
