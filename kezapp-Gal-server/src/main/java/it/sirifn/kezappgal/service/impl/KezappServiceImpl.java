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

        //Se il nickname esiste esiste nel DB
        if (chatRepository.findByNickname(rrdto.getNickname()) != null) {
            //Assegna ID dell' utente (rrdto) presente alla sessione locale 
            List<Chat> lista = new ArrayList<>();
            lista = chatRepository.findByNicknameOrderById(cx.getNickname());

            /*                   
                    -----
                    -----
                    -----
                    -----
             */
            
        } //Controllo se esiste il nickname ricevuto come DTO
        else if (chatRepository.findByNickname(rrdto.getNickname()) == null) {
            //Se il nickname non esiste viene aggiunto al DB
            chatRepository.save(cx);
        }

        return null;
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
