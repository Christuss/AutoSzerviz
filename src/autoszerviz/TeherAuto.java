/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoszerviz;

import java.util.Random;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class TeherAuto extends Auto{
    Random rnd = new Random();
    public TeherAuto() {
        super();
    }
    
    @Override
    public void mozgas() {
        this.allapot = allapot*0.95;
        int a = rnd.nextInt(10)+1;
        if (a == 1) {
            this.allapot = allapot*0.8; 
        }
    } 
    
}
