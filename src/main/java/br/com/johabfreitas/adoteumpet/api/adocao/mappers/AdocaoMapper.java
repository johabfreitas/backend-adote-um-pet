package br.com.johabfreitas.adoteumpet.api.adocao.mappers;

import org.springframework.stereotype.Component;

import br.com.johabfreitas.adoteumpet.api.adocao.dtos.AdocaoRequest;
import br.com.johabfreitas.adoteumpet.core.models.Adocao;
import br.com.johabfreitas.adoteumpet.core.repositories.PetRepository;

@Component
public class AdocaoMapper {
    
    private PetRepository petRepository;

    public Adocao toModel(AdocaoRequest adocaoRequest) {
        var adocao = new Adocao();
        adocao.setEmail(adocaoRequest.getEmail());
        adocao.setValor(adocaoRequest.getValor());
        adocao.setPet(petRepository.findByIdOrElseThrow(adocaoRequest.getPetId()));
        return adocao;
    }
}
