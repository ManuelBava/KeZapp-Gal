package it.sirifn.kezappgal.service.impl;

import it.sirifn.kezappgal.dto.InviaMessaggioDto;
import it.sirifn.kezappgal.dto.RichiediMessaggioDto;
import it.sirifn.kezappgal.dto.RichiediRegistrazioneDto;
import org.springframework.stereotype.Service;
import it.sirifn.kezappgal.service.KezappService;

 @Service
public class KezappServiceImpl implements KezappService{

    @Override
    public RichiediRegistrazioneDto registrazione(RichiediRegistrazioneDto rrdto) {
         throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public InviaMessaggioDto inviaATutti(InviaMessaggioDto iatdto) {
         throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public InviaMessaggioDto inviaAUno(InviaMessaggioDto iaudto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RichiediMessaggioDto aggiorna(RichiediMessaggioDto adto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
