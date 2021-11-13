/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author el_ma
 */
public class Cliente {

    int rut;
    String nombre, apellido;
    int saldoAhorro, saldoCorriente;
    boolean tieneAhorro, tieneCorriente;
    
    public Cliente() {
    }

    public Cliente(int rut, String nombre, String apellido, int saldoAhorro, int saldoCorriente, boolean tieneAhorro, boolean tieneCorriente) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tieneAhorro = tieneAhorro;
        this.tieneCorriente = tieneCorriente;
        this.saldoAhorro = saldoAhorro;
        this.saldoCorriente = saldoCorriente;
    }

    public boolean isTieneAhorro() {
        return tieneAhorro;
    }

    public void setTieneAhorro(boolean tieneAhorro) {
        this.tieneAhorro = tieneAhorro;
    }

    public boolean isTieneCorriente() {
        return tieneCorriente;
    }

    public void setTieneCorriente(boolean tieneCorriente) {
        this.tieneCorriente = tieneCorriente;
    }

    
    
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSaldoAhorro() {
        return saldoAhorro;
    }

    public void setSaldoAhorro(int saldoAhorro) {
        this.saldoAhorro = saldoAhorro;
    }

    public int getSaldoCorriente() {
        return saldoCorriente;
    }

    public void setSaldoCorriente(int saldoCorriente) {
        this.saldoCorriente = saldoCorriente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", saldoAhorro=" + saldoAhorro + ", saldoCorriente=" + saldoCorriente + '}';
    }

    public String rutens() {
        String rutt = String.valueOf(rut);
        return rutt;
    }

    public String sAhorro(){
        String ahorro = String.valueOf(saldoAhorro);
        return ahorro;
    }
    
    public String sCorriente(){
        String corriente = String.valueOf(saldoCorriente);
        return corriente;
    }

}
