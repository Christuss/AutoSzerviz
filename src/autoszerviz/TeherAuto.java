/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoszerviz;

import java.util.Random;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class TeherAuto extends Auto{

    double allapot;
    Random rnd = new Random();
    
    public void mozgas(){
        int rand = rnd.nextInt(10)+1;
        if (rand == 1) {
            allapot = allapot * 0.80;
        } else {
            allapot = allapot * 0.95;
        }
        
    };
}
