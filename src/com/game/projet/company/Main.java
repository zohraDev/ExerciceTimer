package com.game.projet.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        /******************************1 ère Méthode ***********************/
        /*
        Timer chron = new Timer();
        chron.schedule( new  TimerTask(){

                int compteur =10 ; // pour arrêter le chronomètre
            @Override
            public void run() {

                System.out.println("Hi gys");
                compteur--;
                if(compteur==0){
                    cancel();// la méthode qui arrête le chrono.
                }

            }
        },1000,1000);// boucle infinie. delay en milliesecondes.
        */






        /************************************************************/
        /************************    2 ième Méthode  ****************/



        Timer chrono = new Timer();
        chrono.schedule(new JeuxAlea(), 1000,1000);


	// write your code here
    }
}
