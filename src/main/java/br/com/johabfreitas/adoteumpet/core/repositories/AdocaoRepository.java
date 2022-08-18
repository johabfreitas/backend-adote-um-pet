package br.com.johabfreitas.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.johabfreitas.adoteumpet.core.models.Adocao;

public interface AdocaoRepository extends JpaRepository<Adocao, Long>{
    
}
