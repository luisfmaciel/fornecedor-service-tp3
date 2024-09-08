package br.edu.infnet.fornecedorservicotp3.service;

import br.edu.infnet.fornecedorservicotp3.model.Fornecedor;
import br.edu.infnet.fornecedorservicotp3.repository.FornecedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;

    public Fornecedor criarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Iterable<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> buscarPorId(Long id) {
        return fornecedorRepository.findById(id);
    }

    public Fornecedor atualizarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public void deletarFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }
}