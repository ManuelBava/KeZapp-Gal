/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirifn.kezappgal.dto;

/**
 *
 * @author Federico
 */
public class RichiediMessaggioDto {
   private String sessione;

    public RichiediMessaggioDto() {
    }

    public RichiediMessaggioDto(String sessione) {
        this.sessione = sessione;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }
   
   
}
