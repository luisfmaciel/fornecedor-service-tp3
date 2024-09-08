package br.edu.infnet.fornecedorservicotp3.repository;

import br.edu.infnet.fornecedorservicotp3.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}