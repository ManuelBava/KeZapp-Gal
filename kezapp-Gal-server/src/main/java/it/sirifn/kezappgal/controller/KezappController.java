package it.sirifn.kezappgal.controller;

import it.sirifn.kezappgal.dto.InviaMessaggioDto;
import it.sirifn.kezappgal.dto.RegistrazioneDto;
import it.sirifn.kezappgal.dto.RichiediMessaggioDto;
import it.sirifn.kezappgal.dto.RichiediRegistrazioneDto;
import it.sirifn.kezappgal.service.KezappService21;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class KezappController {

    @Autowired
    KezappService21 kezappService;

    @RequestMapping("/registrazione")
    @ResponseBody
    public RegistrazioneDto registrazione(@RequestBody RichiediRegistrazioneDto rrdto) {
        RegistrazioneDto reg = new RegistrazioneDto();
        reg = kezappService.registrazione(rrdto);
        return reg;
    }

    @RequestMapping("/invio-a-tutti")
    @ResponseBody
    public InviaMessaggioDto inviaATutti(@RequestBody InviaMessaggioDto iatdto) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @RequestMapping("/invio-a-uno")
    @ResponseBody
    public InviaMessaggioDto inviaAUno(@RequestBody InviaMessaggioDto iaudto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @RequestMapping("/aggiorna")
    @ResponseBody
    public RichiediMessaggioDto aggiorna(@RequestBody RichiediMessaggioDto adto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
