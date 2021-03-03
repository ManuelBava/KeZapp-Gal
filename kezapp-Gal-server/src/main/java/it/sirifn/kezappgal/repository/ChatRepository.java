/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirifn.kezappgal.repository;

import it.sirifn.kezappgal.model.Chat;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long>{
    List <Chat> findByNicknameLike (String nickname);
    List <Chat> findByNicknameOrderById (String nickname);
}
