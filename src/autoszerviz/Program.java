/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autoszerviz;

/**
 *
 * @author kunszekely.bence
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Program().program();
    }
    
    public void program() {
        Szerviz s = new Szerviz(5);
        SzemelyAuto sa1 = new SzemelyAuto();
        SzemelyAuto sa2 = new SzemelyAuto();
        TeherAuto ta1 = new TeherAuto();
        SzemelyAuto sa3 = new SzemelyAuto();
        s.betesz(sa1);
        s.betesz(sa2);
        s.betesz(sa3);
        s.betesz(ta1);
        
        System.out.println(s.toString());
        sa1.mozgas();
        sa1.mozgas();
        sa1.mozgas();
    }
}
