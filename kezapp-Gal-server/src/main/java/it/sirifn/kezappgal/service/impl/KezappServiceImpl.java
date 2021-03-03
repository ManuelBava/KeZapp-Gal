package it.sirifn.kezappgal.service.impl;

import it.sirifn.kezappgal.dto.InviaMessaggioDto;
import it.sirifn.kezappgal.dto.RichiediMessaggioDto;
import it.sirifn.kezappgal.dto.RichiediRegistrazioneDto;
import it.sirifn.kezappgal.model.Chat;
import it.sirifn.kezappgal.repository.ChatRepository;
import it.sirifn.kezappgal.repository.MessaggioRepository;
import org.springframework.stereotype.Service;
import it.sirifn.kezappgal.service.KezappService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class KezappServiceImpl implements KezappService {

    @Autowired
    ChatRepository chatRepository;

    @Autowired
    MessaggioRepository messaggioRepository;

    @Override
    public RichiediRegistrazioneDto registrazione(RichiediRegistrazioneDto rrdto) {
        //se non trova il nickname
        Chat cx = new Chat();
        cx.setNickname(rrdto.getNickname());
        //Controllo se esiste il nickname ricevuto come DTO

        //Se il nickname esiste esiste nel DB
        if (chatRepository.findByNicknameLike(rrdto.getNickname()) != null) {
            //Assegna ID dell' utente (rrdto) presente alla sessione locale 
            // List<Chat> lista = new ArrayList<>();
            chatRepository.findByNicknameOrderById(cx.getNickname());
            RichiediRegistrazioneDto rDto = new RichiediRegistrazioneDto();
            return rDto;
        } 
        
        //Se il nickname non esiste viene aggiunto al DB
        else if (chatRepository.findByNicknameLike(rrdto.getNickname()) == null) {
            chatRepository.save(cx);
        }
        return rrdto;   
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
