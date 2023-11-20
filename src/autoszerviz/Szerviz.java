/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoszerviz;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class Szerviz {

    private Auto[] autok;
    private int autokSzama;

    public Szerviz(int feroHely) {
        autok = new Auto[feroHely];
    }

    public void betesz(Auto auto) {
        if (autokSzama < autok.length) {
            autok[autokSzama++] = auto;
        } else {
            System.out.println("A szervíz megtelt!");
        }
    }

    public void kivesz(int hanyadikAuto) {
        autok[hanyadikAuto] = new NemLetezoAuto();
        autokSzama--;
    }
    
    public void javit() {
        for (Auto auto : autok) {
            if (auto != null) {
                if (auto instanceof SzemelyAuto) {
                    SzemelyAuto sza = (SzemelyAuto) auto;
                    sza.setAllapot(100);
                } else if (auto instanceof TeherAuto) {
                    TeherAuto ta = (TeherAuto) auto;
                    ta.setAllapot(100);
                }
            }
        }
    }

}
