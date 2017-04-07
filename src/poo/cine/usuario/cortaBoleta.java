/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cine.usuario;

import poo.cine.Pelicula;

/**
 *
 * @author IEUser
 */
public class cortaBoleta extends Usuario {
    
    private int contaEntrada;
    private int peliAsignada;
    private boolean valida;
    
    public cortaBoleta(){
        this.contaEntrada = 0;
        this.peliAsignada = 1;
    }
    
    public void verificarEntrada(int pelicula){
        if (pelicula == this.peliAsignada) {
            this.contaEntrada = this.contaEntrada + 1;
            this.setValida(true);
        } else {
            this.setValida(false);
        }
    }

    /**
     * @return the contaEntrada
     */
    public int getContaEntrada() {
        return contaEntrada;
    }

    /**
     * @param contaEntrada the contaEntrada to set
     */
    public void setContaEntrada(int contaEntrada) {
        this.contaEntrada = contaEntrada;
    }

    /**
     * @return the peliAsignada
     */
    public int getPeliAsignada() {
        return peliAsignada;
    }

    /**
     * @param peliAsignada the peliAsignada to set
     */
    public void setPeliAsignada(int peliAsignada) {
        this.peliAsignada = peliAsignada;
    }

    /**
     * @return the valida
     */
    public boolean isValida() {
        return valida;
    }

    /**
     * @param valida the valida to set
     */
    public void setValida(boolean valida) {
        this.valida = valida;
    }
    
}
