package br.edu.infnet.fornecedorservicotp3.controller;

import br.edu.infnet.fornecedorservicotp3.model.Fornecedor;
import br.edu.infnet.fornecedorservicotp3.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<Fornecedor> criarFornecedor(@RequestBody Fornecedor fornecedor) {
        Fornecedor criado = fornecedorService.criarFornecedor(fornecedor);
        return ResponseEntity.ok(criado);
    }

    @GetMapping
    public ResponseEntity<Iterable<Fornecedor>> listarFornecedores() {
        Iterable<Fornecedor> fornecedores = fornecedorService.listarFornecedores();
        return ResponseEntity.ok(fornecedores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> buscarFornecedorPorId(@PathVariable Long id) {
        Optional<Fornecedor> fornecedor = fornecedorService.buscarPorId(id);
        return fornecedor.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fornecedor> atualizarFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
        fornecedor.setId(id);
        Fornecedor atualizado = fornecedorService.atualizarFornecedor(fornecedor);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarFornecedor(@PathVariable Long id) {
        fornecedorService.deletarFornecedor(id);
        return ResponseEntity.noContent().build();
    }
}