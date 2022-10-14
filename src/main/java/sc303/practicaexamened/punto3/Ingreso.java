/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.practicaexamened.punto3;

/**
 *
 * @author usuario
 */
public class Ingreso {
    
    private String sector;
    private int cedula;
    private int horario;
    
    public Ingreso(String sector, int cedula, int horario){ //constructores
        this.sector = sector;
        this.horario = horario;
        this.cedula = cedula;
        
    }
    public Ingreso(){
    }
    

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
    

 
    @Override
    public String toString(){
        return "Persona{" + "cedula="+cedula+", Sector="+sector+", Horario="+horario+'}';
    } 
    
}
