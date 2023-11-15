/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoszerviz;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class SzemelyAuto extends Auto{
    double allapot;
    
    public void mozgas(){
        allapot = allapot * 0.97;
    };
}
