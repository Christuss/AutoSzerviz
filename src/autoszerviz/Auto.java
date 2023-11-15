/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoszerviz;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public abstract class Auto {
    double allapot;
    
    public double getAllapot() {
        return allapot;
    }

    public void setAllapot(double allapot) {
        this.allapot = allapot;
    }
    
    public void mozgas(){
        this.allapot = allapot*0.99;
    }
    
}
