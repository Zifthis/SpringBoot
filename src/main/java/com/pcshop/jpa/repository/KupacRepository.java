package com.pcshop.jpa.repository;

import com.pcshop.jpa.dto.InputResponse;
import com.pcshop.jpa.dto.PrezimeResponse;
import com.pcshop.jpa.entity.Kupac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface KupacRepository extends JpaRepository<Kupac, Integer> {

    /**
     * Query request -> selektiraj ime i vrstu i mapiraj ih u InputResponse klasu
     * Zatim FROM kupac klase (k) spoji JOIN racunalo listu
     * **/
    @Query("SELECT new com.pcshop.jpa.dto.InputResponse(k.ime, r.vrsta) FROM Kupac k JOIN k.racunaloList r")
    public List<InputResponse> getJoinIme();


    @Query("SELECT new com.pcshop.jpa.dto.PrezimeResponse(k.prezime, r.vrsta) FROM Kupac k JOIN k.racunaloList r")
    public List<PrezimeResponse> getJoinPrezime();

}
