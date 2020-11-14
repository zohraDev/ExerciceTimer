package com.game.projet.company;

import java.util.TimerTask;

public class ExoTimer extends TimerTask {

    private int compteur =10;
    @Override
    public void run() {

        System.out.println("Ile vous reste " +compteur+"secondes");
        compteur--;

        if (compteur==5){
            System.out.println("Attention ");
        }
        if (compteur==0){

            System.out.println("Terminer !!!!!!!!"+"🤪🤪🤪");
            cancel();
        }

    }
}
