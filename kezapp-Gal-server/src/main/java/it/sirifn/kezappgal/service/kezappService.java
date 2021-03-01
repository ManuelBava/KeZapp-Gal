/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.sirifn.kezappgal.service;

import it.sirifn.kezappgal.dto.InviaMessaggioDto;
import it.sirifn.kezappgal.dto.RichiediMessaggioDto;
import it.sirifn.kezappgal.dto.RichiediRegistrazioneDto;

public interface kezappService {

   RichiediRegistrazioneDto registrazione(RichiediRegistrazioneDto rrdto);
   
   InviaMessaggioDto inviaATutti(InviaMessaggioDto iatdto);
   
   InviaMessaggioDto inviaAUno(InviaMessaggioDto iaudto);
   
   RichiediMessaggioDto aggiorna(RichiediMessaggioDto adto);
   
}
