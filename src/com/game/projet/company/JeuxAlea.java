package com.game.projet.company;

import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;

public class JeuxAlea extends TimerTask {

   Random rand =new Random();
   Scanner scan=new Scanner(System.in);
   int userNumber;
   int counter =5;

    @Override
    public void run() {
        System.out.println("Give a number between 1 and 6");
        counter--;
        // generate a random number between 1 and 6
        int generateNumber =rand.nextInt(5)+1 ;//
        userNumber =scan.nextInt();

        if (counter==0){
            if(userNumber==generateNumber){
                System.out.println("Congratulation ");
            }else {
                System.out.println("You lost");
            }
            cancel();
        }








    }
}
