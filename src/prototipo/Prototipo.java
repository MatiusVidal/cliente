/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototipo;

/**
 *
 * @author equipo
 */
public class Prototipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Bicicleta bicicle = new BicicletaModificada();
        bicicle.setColor("negro");
        bicicle.setRodada(24);
        Bicicleta bici = bicicle.clone();
        bici.setColor("verde");
        bici.setRodada(20);
        System.out.println(bici.verBicicleta());
    }
    
}
