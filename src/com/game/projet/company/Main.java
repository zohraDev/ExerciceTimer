package com.game.projet.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        /******************************1 ère Méthode ***********************/
        Timer chron = new Timer();
        chron.schedule( new  TimerTask(){


            @Override
            public void run() {
                System.out.println("");
            }
        },1000,1000);





        /************************************************************/



	// write your code here
    }
}
