/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipo;

/**
 *
 * @author equipo
 */
public class BicicletaModificada extends Bicicleta{

    @Override
    public String verBicicleta() {
        return "la bicicleta es de color " +this.getColor()+"la rodada es: "+this.getRodada();
    }
    
}
