package br.com.dtelizeudev.demojndi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dtelizeudev.demojndi.model.Pessoa;
import br.com.dtelizeudev.demojndi.repository.PessoaRepository;

/**
 * PessoaResource
 */
@RestController
@RequestMapping("pessoa")
public class PessoaResource {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public Page<Pessoa> listarTodos(Pageable pageable) {
        return repository.findAll(pageable);
    }
}