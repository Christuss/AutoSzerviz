/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoszerviz;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class SzemelyAuto extends Auto{

    public SzemelyAuto() {
        super();
    }

    @Override
    public void mozgas() {
        this.allapot = allapot*0.97;
    } 
    
    
}
