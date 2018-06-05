/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lizardpopulation;

import javax.swing.JOptionPane;

/**
 *
 * @author Muaaz Bhyat
 */
public class LizardPopulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double no = Double.parseDouble(JOptionPane.showInputDialog("What is the current population of Lizrds.")),
                r = Double.parseDouble(JOptionPane.showInputDialog("What is the growth rate of the Lizards, Default is 0.078")),
                e = 2.71828, i = 1, n = no * (Math.pow(e, r * 5));
        n = Math.round(n);
        System.out.println("Years\tActual Year\tPopulation");
        for (int j = 0; j < 30; j++) {
            System.out.print("=");
        }
        System.out.println("");
        for (int j = 5; j <= 100; j = j + 5) {
            n = no * (Math.pow(e, r * j));
            n = Math.round(n);
            System.out.println(j + "\t" + (2018 + j) + "\t\t" + n);

        }

    }

}
