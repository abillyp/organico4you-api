package br.com.organico4you.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.organico4you.api.model.Linha;

public interface LinhaRepository extends JpaRepository<Linha, Long> {

}
