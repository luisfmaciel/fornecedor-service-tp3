package br.edu.infnet.fornecedorservicotp3.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "fornecedores")
@Data
@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
}
