/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirifn.kezappgal.repository;

import it.sirifn.kezappgal.model.Messaggio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author manue
 */
public interface MessaggioRepository extends JpaRepository<Messaggio, Long> {

}
