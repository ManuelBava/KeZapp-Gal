package it.sirifn.kezappgal.service.impl;

import it.sirifn.kezappgal.dto.InviaMessaggioDto;
import it.sirifn.kezappgal.dto.RegistrazioneDto;
import it.sirifn.kezappgal.dto.RichiediMessaggioDto;
import it.sirifn.kezappgal.dto.RichiediRegistrazioneDto;
import it.sirifn.kezappgal.model.Chat;
import it.sirifn.kezappgal.repository.ChatRepository;
import it.sirifn.kezappgal.repository.MessaggioRepository;
import it.sirifn.kezappgal.service.KezappService21;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class KezappServiceImpl implements KezappService21 {

    @Autowired
    ChatRepository chatRepository;

    @Autowired
    MessaggioRepository messaggioRepository;

  
    @Override
    public RegistrazioneDto registrazione(RichiediRegistrazioneDto rrdto) {
        //se non trova il nickname
        Chat cx = new Chat();
        RegistrazioneDto rDto = new RegistrazioneDto();
        cx.setNickname(rrdto.getNickname());
        //Controllo se esiste il nickname ricevuto come DTO

        //Se il nickname NON ESISTE nel DB
        if (chatRepository.findByNickname(rrdto.getNickname()).isEmpty()) {
            cx = chatRepository.save(cx);
            // Prendo id da cx e (string) e lo metto in cx.sessione
            //aggiorno db con save 
            cx.setSessione(cx.getId().toString());
            //Aggiorno DB
            chatRepository.save(cx);
            //carico i dati in rRto
            rDto.setSessione(cx.getSessione());
            return rDto;
        } else {
            return rDto;
        }
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
