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
public class RichiediRegistrazioneDto {
    private String nickname;

    public RichiediRegistrazioneDto(String nickname) {
        this.nickname = nickname;
    }

    public RichiediRegistrazioneDto() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
}
