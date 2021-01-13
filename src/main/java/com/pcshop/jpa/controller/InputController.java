package com.pcshop.jpa.controller;


import com.pcshop.jpa.dto.InputRequest;
import com.pcshop.jpa.dto.InputResponse;
import com.pcshop.jpa.dto.PrezimeResponse;
import com.pcshop.jpa.entity.Kupac;
import com.pcshop.jpa.repository.KupacRepository;
import com.pcshop.jpa.repository.RacunaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InputController {

    @Autowired
    private KupacRepository kupacRepository;

    @Autowired
    private RacunaloRepository racunaloRepository;

    @PostMapping("/enterKupac")
    public Kupac enterKupac(@RequestBody InputRequest request) {
        return kupacRepository.save(request.getKupac());
    }

    @GetMapping("/findAllKupac")
    public List<Kupac> findAllKupac() {
        return kupacRepository.findAll();
    }

    @GetMapping("/getimekupca")
    public List<InputResponse> getJoinIme() {
        return kupacRepository.getJoinIme();
    }

    @GetMapping("/getprezimekupca")
    public List<PrezimeResponse> getJoinPrezime() {
        return kupacRepository.getJoinPrezime();
    }


}
