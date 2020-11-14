package com.game.projet.company;

import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;

public class JeuxAlea extends TimerTask {

   Random rand =new Random();
   Scanner scan=new Scanner(System.in);
   int userNumber;
   int counter =5;
    private int generateNumber;

    @Override
    public void run() {
        if(counter==5){
            System.out.println("Give a number");

        }

        // generate a random number between 1 and 6


        counter--;
        //System.out.println("Time  "+counter);

        if (counter==0) {
           generateNumber =rand.nextInt(5)+1 ;//
            //System.out.println(generateNumber);
            userNumber=scan.nextInt();

                  if (userNumber == generateNumber) {
                      System.out.println("Congratulation ");


                  } else {
                      System.out.println("You lost");


                  }
                  cancel();
                  System.exit(0);
              }

    }
}
