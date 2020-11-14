package com.game.projet.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        /******************************1 ère Méthode ***********************/
        Timer chron = new Timer();
        chron.schedule( new  TimerTask(){

                int compteur =0 ; // pour arrêter le chronomètre
            @Override
            public void run() {

                System.out.println("Hi gys");

            }
        },1000,1000);// boucle infinie. delay en milliesecondes.





        /************************************************************/



	// write your code here
    }
}
