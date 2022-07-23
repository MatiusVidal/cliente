/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipo;

/**
 *
 * @author equipo
 */
public abstract class Bicicleta implements Cloneable{
    private String color;
    private int rodada;
    public Bicicleta clone() throws CloneNotSupportedException{
        return (Bicicleta)super.clone();
    }
    public abstract String verBicicleta();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }
    
}
