package it.sirifn.kezappgal.service.impl;

import it.sirifn.kezappgal.dto.InviaMessaggioDto;
import it.sirifn.kezappgal.dto.RegistrazioneDto;
import it.sirifn.kezappgal.dto.RichiediMessaggioDto;
import it.sirifn.kezappgal.dto.RichiediRegistrazioneDto;
import it.sirifn.kezappgal.model.Chat;
import it.sirifn.kezappgal.repository.ChatRepository;
import it.sirifn.kezappgal.repository.MessaggioRepository;
import org.springframework.stereotype.Service;
import it.sirifn.kezappgal.service.KezappService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class KezappServiceImpl implements KezappService {

    @Autowired
    ChatRepository chatRepository;

    @Autowired
    MessaggioRepository messaggioRepository;

    /**
     *
     * @param rrdto
     * @return
     */
    @Override
    public RegistrazioneDto registrazione(RichiediRegistrazioneDto rrdto) {
        //se non trova il nickname
        Chat cx = new Chat();
        RegistrazioneDto rDto = new RegistrazioneDto();
        cx.setNickname(rrdto.getNickname());
        //Controllo se esiste il nickname ricevuto come DTO

        //Se il nickname esiste esiste nel DB
        if (chatRepository.findByNickname(rrdto.getNickname()) != null) {
            //Assegna ID dell' utente (rrdto) presente alla sessione locale 
//            // List<Chat> lista = new ArrayList<>();
//            chatRepository.findByNicknameOrderById(cx.getNickname());
            return rDto;
        } //Se il nickname non esiste viene aggiunto al DB
        else /*(chatRepository.findByNickname(rrdto.getNickname()) == null) */
        {
            //Prendo la risposta del db
            cx = chatRepository.save(cx);
            // Prendo id da cx e (string) e lo metto in cx.sessione
            //aggiorno db con save 
            cx.setSessione(cx.getId().toString());
            //Aggiorno DB
            chatRepository.save(cx);
            //carico i dati in rRto
            rDto.setSessione(cx.getSessione());
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
