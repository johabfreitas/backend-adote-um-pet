package br.com.johabfreitas.adoteumpet.api.adocao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.johabfreitas.adoteumpet.api.adocao.mappers.AdocaoMapper;
import br.com.johabfreitas.adoteumpet.core.repositories.AdocaoRepository;

@RestController
public class AdocaoController {
    
    @Autowired
    private AdocaoRepository adocaoRepository;

    @Autowired
    private AdocaoMapper adocaoMapper;

    public 

}
