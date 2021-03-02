import { Chat } from "./chat";
import { Messaggio } from "./messaggio"

export class RergistrazioneDto {
    messaggi: Messaggio[] = [];
    contatti: Chat[] = [];
    sessione = "";

}