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
    protected double allapot;
    
    public double getAllapot() {
        return allapot;
    }

    public void setAllapot(double allapot) {
        this.allapot = allapot;
    }
    
    public abstract void mozgas();
    
}
