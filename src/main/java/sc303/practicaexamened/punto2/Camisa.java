/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.practicaexamened.punto2;

/**
 *
 * @author usuario
 */
public class Camisa {
    
    private String camisa;
    private String talla;
    private String color;
    private String marca;
    private int id;
    
    public void Camisa(){ //constructores
        
    }


    public Camisa(String camisa, String talla, String color, String marca, int id) {
        this.camisa = camisa;
        this.talla = talla;
        this.color = color;
        this.marca = marca;
        this.id = id;
    }
    
    
    

    public String getCamisa() {
        return camisa;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
    
