import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { RichiediRegistrazioneDto } from './richiedi-registrazione-dto';
import { RegistrazioneDto } from './registrazione-dto';
import { HttpClient } from '@angular/common/http';
import { Chat } from './chat';
import { Messaggio } from './messaggio';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nickname: string;
  url = "http://localhost:8080/";
  contatti: Chat[] = [];
  messaggi: Messaggio[] = [];
  sessione: string;
  constructor(private http: HttpClient) { }
  reg: RichiediRegistrazioneDto = new RichiediRegistrazioneDto();

  registra() {
    // metto il nickname dentro il dto
    this.reg.nickname = this.nickname;
    this.reg = new RichiediRegistrazioneDto();
    //preparo la richiesta post verso il server
    let ox: Observable<RegistrazioneDto> = this.http
      .post<RegistrazioneDto>(this.url + "registrazione", this.reg);
    ox.subscribe(r => {
      this.contatti = r.contatti;
      this.messaggi = r.messaggi;
      this.sessione = r.sessione;
    })
    console.log(this.contatti, this.messaggi, this.sessione);

  }

  inviaATutti() {

  }

  aggiorna() {

  }
}
