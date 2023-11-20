/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoszerviz;

/**
 *
 * @author kunszekely.bence
 */
public class Szerviz {
    private Auto[] autok;
    private int AutoDb;

    public Szerviz() {
        this(1);
    }
    
    public Szerviz(int feroHely) {
        autok = new Auto[feroHely];
    }
    
    public void javit(){
        for (Auto auto : autok) {
            auto.setAllapot(100.0);
        }
    }
    
    public Auto kivesz(int sorszám){
        return autok[sorszám];
    }
    
    public void betesz(Auto auto){
        
    }
}
